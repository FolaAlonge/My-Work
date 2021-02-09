function tuClass(className, classCode, prereq, hasTaken) {
    this.className = className;
    this.classCode = classCode;
    this.isPrereq = isPrereq;
    this.hasTaken = hasTaken;
}

var webDev = new tuClass("Web-Based Programing", "COSC 484", "COSC 336", false);

var fresh, soph, jr, sr;

var reqClasses = [webDev];

function sortClasses(reqC, sem) {
    var count=0;
    for(var i = 0; i < reqC.length(); i++){
    while (count<=4) {
       if (reqC[i].hasTaken == true && prereqCompleted(reqC, reqC[i])==true){
           sem[count] = reqC[i];
           recC[i].classCode = "";
       } 
    }
    }
    return sem;
}

function prereqCompleted(reqC, cLass) {
    for (var i = 0; i < reqC.length(); i++){
        if(reqC[i].classCode == cLass.prereq){
            return false;
        }
    }
    return true;
}

