import React,{Component} from "react";

class stock extends Component{

    render() {

      return(
          <div>
          <p>{this.props.dashValues.stockName}</p>

            <p>{this.props.dashValues.stockQty}</p>

        </div>)
           }
}

export default stock;