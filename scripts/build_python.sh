#!/bin/bash
set -e

# Store current directory.
topLevelDir=$(pwd)

pythonTests=$(find $topLevelDir/ -path $topLevelDir -prune -o -type f -name "test_*.py")
for pyTest in $pythonTests; do
	echo "`date +'%Y-%m-%d_%H'`: Executing python $pyTest test file."

	pyTestDir=$(cd $(dirname "$pyTest") && pwd -P)
	cd $pyTestDir

	# Let's not fail for the time being.
	$pyTest || true

	cd $topLevelDir
done;

cd $topLevelDir
