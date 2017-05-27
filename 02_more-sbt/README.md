# scala-tapas-001
@MálagaScala meetup, March 10th  2017

## SBT
* Basado en Ivy (sucesor de Maven)

```
src/
  main/
    resources/
       <files to include in main jar here>
    scala/
       <main Scala sources>
    java/
       <main Java sources>
  test/
    resources
       <files to include in test jar here>
    scala/
       <test Scala sources>
    java/
       <test Java sources>
```

* La mayoría de la gente usa un directorio `project` en el primer nivel

## Bajando SBT
Una instalación de SBT global

1. `curl -LO https://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/0.13.13/sbt-launch.jar`
2. `./sbt version` gets SBT binary and dependencies into `~/.ivy2`
