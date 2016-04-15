package com.bhr.scala

package spark{
  package navtigation{
    private[spark] class Navigator{
      protected[spark] def useStartChar(){
        println("this is navtigation.Navigator.useStartChar")
      }
      
      private[this] var speed = 200
      
      class LegOfJournet{
        private[navtigation] val distance = 100
      }
    }
  }
  
  
  package launch{
    
    import navtigation._
    
    object Vehicle{
      private[launch] val guide = new Navigator
      guide.useStartChar
    }
  }
  
}

class PackageOps {
  
}

object PackageOps{
  import spark.navtigation._
  
  //private[launch] val guide = new Navigator
}