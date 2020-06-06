#!/bin/bash
set -e

# Store current directory.
topLevelDir=$(pwd)

# First we need to build the parent pom.
echo "`date +'%Y-%m-%d_%H'`: Building parent pom."
cd ParentPom/
mvn -U clean install clean
cd $topLevelDir

poms=$(find $topLevelDir/ -path $topLevelDir/ParentPom -prune -path $topLevelDir -prune -o -type f -name pom.xml)
for pom in $poms; do
	echo "`date +'%Y-%m-%d_%H'`: Building $pom pom file."

	pomDir=$(cd $(dirname "$pom") && pwd -P)
	cd $pomDir

	# Let's not fail for the time being.
	mvn -U clean install clean || true

	cd $topLevelDir
done;

cd $topLevelDir
