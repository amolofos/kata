#!/bin/bash
set -e

# Store current directory.
topLevelDir=$(pwd)

# TODO
# Update the version automatically.

# First we need to build the parent pom.
echo "`date +'%Y-%m-%d_%H'`: Building parent pom."
cd ParentPom/
mvn -U clean install clean
cd $topLevelDir

# Then build everything else.
poms=$(find . -path ./ParentPom -path . -prune -o  -type f -name pom.xml)
for pom in $poms; do 
	echo "`date +'%Y-%m-%d_%H'`: Building $pom pom file."
	
	pomDir=$(cd $(dirname "$pom") && pwd -P)
	cd $pomDir
	
	mvn -U clean install clean
	
	cd $topLevelDir
done;

