#!/usr/bin/bash

echo "ENV VARS"
echo "========"
echo "Sonatype username is ${#ORG_GRADLE_PROJECT_sonatypeUsername} digits long"
echo "Sonatype password is ${#ORG_GRADLE_PROJECT_sonatypePassword} digits long"
echo "Signing Key is ${#ORG_GRADLE_PROJECT_signingKey} digits long"
echo "Signing Password is ${#ORG_GRADLE_PROJECT_signingPassword} digits long"
key_sum=$(echo -n "${ORG_GRADLE_PROJECT_signingKey}" | md5sum)
echo "Signing key checksum is ${key_sum}"
echo "============"
echo "END ENV VARS"
