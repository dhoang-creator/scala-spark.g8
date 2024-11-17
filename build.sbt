val Http4sVersion = "0.23.27"
val CirceVersion = "0.14.9"
val MunitVersion = "1.0.0"
val LogbackVersion = "1.5.6"
val MunitCatsEffectVersion = "2.0.0"
val Spark = "3.5.3"

lazy val root = (project in file("."))
  .settings(
    organization := "dhoang.nl",
    name := "spark-scala-g8",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.14",
    libraryDependencies ++= Seq(
      // Spark
      "org.apache.spark" %% "spark-core" % Spark,
      "org.apache.spark" %% "spark-sql" % Spark,
      "org.apache.spark" %% "spark-streaming" % Spark,
      "org.apache.spark" %% "spark-mllib" % Spark,
      "org.apache.spark" %% "spark-hive" % Spark,
      "org.apache.spark" %% "spark-catalyst" % Spark,
      "org.apache.spark" %% "spark-avro" % Spark,
      "org.apache.spark" %% "spark-graphx" % Spark,
      "org.apache.spark" %% "spark-yarn" % Spark,


      "org.http4s"      %% "http4s-ember-server" % Http4sVersion,
      "org.http4s"      %% "http4s-ember-client" % Http4sVersion,
      "org.http4s"      %% "http4s-circe"        % Http4sVersion,
      "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
      "io.circe"        %% "circe-generic"       % CirceVersion,
      "org.scalameta"   %% "munit"               % MunitVersion           % Test,
      "org.typelevel"   %% "munit-cats-effect"   % MunitCatsEffectVersion % Test,
      "ch.qos.logback"  %  "logback-classic"     % LogbackVersion,
      "org.scalameta"   %  "svm-subs"            % "101.0.0"
    ),
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.13.3" cross CrossVersion.full),
    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
  )

