name := "scalikejdbc_samle"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  "com.github.seratch" %% "scalikejdbc"             % "[1.6,)",
  "com.github.seratch" %% "scalikejdbc-play-plugin" % "[1.6,)"
  ,"com.github.seratch" %% "scalikejdbc-interpolation" % "[1.6,)"
)     

play.Project.playScalaSettings
