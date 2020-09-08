import React,{Component} from 'react'


let date=new Date().getDate();
class Welcome extends Component {

    render() {
        return(<div>Welcome User</div>);
    }
}

class DateComp extends Component{
    render() {
        var date=new Date().getDate();
        var month=new Date().getMonth()+1;
        var year=new Date().getFullYear()
       return(<div style={{textAlign :"right"}} >Dated : <span>{date}/{month}/{year}</span></div>);
    }
}

export {Welcome,DateComp}



