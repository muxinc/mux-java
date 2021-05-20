#!/bin/bash
set -euo pipefail

ROOT=$(realpath "$(dirname "$0")")
cd "${ROOT}"

if [ -z "${MUX_TOKEN_ID:-}" ]
then
      echo "MUX_TOKEN_ID not set"
      exit 255
fi

if [ -z "${MUX_TOKEN_SECRET:-}" ]
then
      echo "MUX_TOKEN_SECRET not set"
      exit 255
fi

JAR="${ROOT}/build/libs/mux-sdk-java.jar"

if [ ! -f "${JAR}" ]
then
      echo "Could not find \"${JAR}\". Run \"./gradlew build\"."
      exit 255
fi

VIDEO_TESTS=./examples/video/*.groovy
for f in $VIDEO_TESTS
do
  echo "========== Running $f =========="
    groovy -cp "${JAR}" "$f"
done

DATA_TESTS=./examples/data/*.groovy
for f in $DATA_TESTS
do
  echo "========== Running $f =========="
    groovy -cp "${JAR}" "$f"
done
