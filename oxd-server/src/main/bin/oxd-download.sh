#!/bin/sh

warName=oxd-server-1.5-SNAPSHOT-distribution.zip
distDir=oxd-dist

# Clean up
rm -f $warName
rm -f -r $destDir

# Download and unzip
wget http://ox.gluu.org/maven/org/xdi/oxd-server/1.5-SNAPSHOT/$warName
unzip $warName -d $distDir