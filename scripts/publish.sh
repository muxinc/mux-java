#!/usr/bin/bash

echo "ENV VARS"
echo "========"
echo "Sonatype username is ${ORG_GRADLE_PROJECT_sonatypeUsername}"
echo "Sonatype password is ${#ORG_GRADLE_PROJECT_sonatypePassword} digits long"
echo "Signing Key is ${#ORG_GRADLE_PROJECT_signingKey} digits long"
echo "Signing Password is ${#ORG_GRADLE_PROJECT_signingPassword} digits long"
echo "============"
echo "END ENV VARS"
