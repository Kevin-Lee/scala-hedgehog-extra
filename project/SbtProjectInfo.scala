import wartremover.WartRemover.autoImport.{Wart, Warts}

object SbtProjectInfo {
  final case class ProjectName(projectName: String) extends AnyVal

  val ProjectVersion: String = "0.1.0"

  def commonWarts(scalaBinaryVersion: String): Seq[wartremover.Wart] =
    scalaBinaryVersion match {
      case "2.10" =>
        Seq.empty
      case _ =>
        Warts.all
    }

}
