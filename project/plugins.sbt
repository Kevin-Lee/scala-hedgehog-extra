logLevel := sbt.Level.Warn

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.10")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.7")

addSbtPlugin("io.kevinlee" % "sbt-devoops" % "1.0.3")

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.13")

addSbtPlugin("io.kevinlee" % "sbt-docusaur" % "0.3.0")

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.4.6")
