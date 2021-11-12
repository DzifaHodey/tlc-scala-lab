object FunctionalCollections {

  def main(args: Array[String]): Unit = {

    println(nonHiddenFiles)
  }

  // List of all files in current directory
  val fileList = (new java.io.File(".")).listFiles.toList

  // Generate a list of the names of all the files in the current directory, excluding the "hidden" files
  val nonHiddenFiles = fileList.partition(_.isHidden)._1

//  Generate two lists of entries in the directory, one containing the files and one containing the directories.
  val (dir, files) = fileList.partition(_.isDirectory)



}
