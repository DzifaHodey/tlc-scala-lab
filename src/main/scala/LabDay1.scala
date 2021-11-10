object LabDay1 {
  def main(args: Array[String]): Unit = {
    celciusToFahrenheit(50.5)
    convertDateToFull("01/05/11")
    extractFields("daemon:x243A:2:5:daemon:/sbin:/sbin/nologin")
  }

  // Converts celcius to fahrenheit
  def celciusToFahrenheit(c: Double) = (c * 9 / 5) + 32


  // Convert dd/mm/yy format to full word format
  def convertDateToFull(dateGiven: String) ={
    val dateArray = dateGiven.split("/")
    val day = convertDayToWords(dateArray(0))
    val month = convertMonthToWords(dateArray(1))
    val year = convertYearToFull(dateArray(2))
    println(s"${day} ${month} ${year}")
  }

  def convertDayToWords(day: String) ={
    val num = day.toInt
    num match {
      case 1 | 21 | 31 => s"${num}st"
      case 2 | 22 => s"${num}nd"
      case 3 | 23 => s"${num}rd"
      case _ => s"${num}th"
    }
  }

  def convertMonthToWords(month: String) = {
    month match {
      case "01" | "1" => "January"
      case "02" | "2" => "February"
      case "03" | "3" => "March"
      case "04" | "4"=> "April"
      case "05" | "5"=> "May"
      case "06" | "6"=> "June"
      case "07" | "7"=> "July"
      case "08" | "8"=> "August"
      case "09" | "9"=> "September"
      case "10" => "October"
      case "11"=> "November"
      case "12"=> "December"
    }
  }

  def convertYearToFull(year: String) = s"20$year"


  // Extract fields from unix/linux password file
  def extractFields(line: String) = {
    // simple regex
//    val Array(username, password, userid, groupid, description, homeDirectory, shell) = line.split(":")

    // regex (accurate)
    val pattern = raw"([a-z]*):([a-zA-Z0-9]*):([0-9]):([0-9]):([a-z]*):([/a-z]*):([/a-z]*)".r
    val pattern(username, password, userid, groupid, description, homeDirectory, shell) = line
    println(username, password, userid, groupid, description, homeDirectory, shell)

  }

}

