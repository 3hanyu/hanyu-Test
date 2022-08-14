import React, {Component} from 'react'
import  {ipList as presentIp} from './config/ipconfig';
 
class Page1 extends Component{
    constructor(props){
        super(props);
        this.state={
            mytext: [],
            message:""
        }
    }
    getData(){
        //修改请求头
        
        let myHeaders = new Headers({
            'Content-Type': 'text/plain'
        });
        fetch(presentIp.LOC_IP + '/hello',{
            method:'GET',
            headers: myHeaders,
            mode: 'cors',
            //转或称字符串格式
        }).then(res=>res.text()).then(
            data=>{
                console.log(data);
                this.setState({
                     message : data
                })
                // eslint-disable-next-line
            }
        )
    }
    //React周期函数，防止死循环,在组建被渲染前调用
    componentWillMount(){
        this.getData();
    }
    render() {
        return (
            <React.Fragment>
                {this.state.message}
            </React.Fragment>
        )
    }
}
export default Page1;