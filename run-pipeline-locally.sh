#!/bin/bash

echo "Running GitHub Actions pipeline locally..."
echo "Make sure Docker is running before executing this script."
echo ""

# Check if Docker is running
if ! docker ps > /dev/null 2>&1; then
    echo "❌ Docker is not running. Please start Docker and try again."
    exit 1
fi

echo "✅ Docker is running"
echo ""

# Run the build job
echo "🚀 Running build job..."
act -j build

echo ""
echo "✅ Local pipeline execution completed!"
