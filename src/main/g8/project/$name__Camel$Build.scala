import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies := Seq(
        "org.scala-lang" % "scala-library" % "2.10.2",
        "org.specs2" %% "specs2" % "latest.integration" % "test",
        "org.specs2" %% "specs2-scalaz-core" % "latest.integration" % "test",
        "junit" % "junit" % "latest.integration" % "test",
        "org.hamcrest" % "hamcrest-all" % "latest.integration" % "test",
        "org.pegdown" % "pegdown" % "latest.integration" % "test"
      )
      // add other settings here
    )
  )
}
