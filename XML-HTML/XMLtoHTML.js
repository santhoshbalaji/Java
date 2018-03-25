var v = 0;
var p = 1;

function cls(idd) {
    return document.getElementsByClassName(idd);
}
/**
 * 
 * 
 * @param {any} idd 
 * @returns 
 */
function id(idd) {
    return document.getElementById(idd);
}    
/**
 * 
 * 
 * @param {any} e 
 */
function slide(e) {
    var SlideDiv = id('SlideDiv');
    var width = cls('slide')[0].offsetWidth;
    SlideDiv.style.width = ((SlideDiv.childElementCount)*width)+"px";
    if (e.key == "ArrowRight") {
        if(v < 0){
            v = 0;
        }
        v++;
        var leftP = -(width*v);
        cls('slide-wrapper')[0].style.transform =" translateX("+leftP+"px)";
        
        if (v == id('SlideDiv').childElementCount) {
            v = 0;
            cls('slide-wrapper')[0].style.transform = " translateX(0px)";
        }
    } else if (e.key == "ArrowLeft") {
        var width = cls('slide')[0].offsetWidth;
        v--;
        var leftP = -(width*v);
        if(v>=0)
            cls('slide-wrapper')[0].style.transform =" translateX("+leftP+"px)";    
        console.log(v);
    }

}
