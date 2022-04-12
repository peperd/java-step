# Tests for  step SaaS
## Java stack Maven framework
### Getting started


#### Download step on-prem
1. Download `JDK 11` from Oracle’s website
2. Download the latest `Community MongoDB Server` instance from the official website
3. Download the `step-controller-3.18.2` from https://github.com/exense/step/releases/tag/3.18.2

#### Install step on-prem
1. Unzip step-controller-3.18.2 archive.
2. Set the path to the JDK’s home
3. Install MongoDB, using the default port (27001).

#### Run step on-prem
1. Run MongoDB `brew services start mongodb-community@5.0`
2. Run agent `bash startController.command`

#### Starting IDE
1. Install `Intelij IDEA` from https://www.jetbrains.com/ru-ru/idea/download/
2. Open folder `java-step` in IDE
3. Check `pom.xml` for Maven dependencies updates
4. Run tests in `TC_Step.java`