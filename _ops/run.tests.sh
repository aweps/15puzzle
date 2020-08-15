#!/bin/bash

set -Eeuo pipefail

source _ops/get-deps.sh

dartanalyzer ./

flutter test || :
