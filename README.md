# sbt swallows javac warnings

```
sbt clean compile
...
[info] Compiling 2 Java sources to /home/mp/Projects/sbt-swallows-javac-warnings/target/scala-2.12/classes...
[warn]  annotations.CustomAnnotation
[error] warnings found and -Werror specified
[error] (compile:compileIncremental) javac returned nonzero exit code
```

Problem: it swallows the javac warning details. Here is the same with javac:

```
javac -cp log4j-core-2.8.jar -Xlint:all -Werror src/main/java/annotations/*.java
...
warning: No processor claimed any of these annotations: annotations.CustomAnnotation
error: warnings found and -Werror specified
1 error
1 warning
```

