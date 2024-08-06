const points=[4,2,5,3,2,7,1,4];
//point total

//Imperative
// let total=0; //state

// total+=points[0];
// total+=points[1];
// total+=points[2];
// total+=points[3];

// for(let point of points){
//     total+=point;
// }

// console.log(total);

//Declarative
// let total= points.reduce((pv,cv)=> pv+cv,0);
// console.log(total);


const uniqueArray=[];//state

for(let point of points){
    if(!uniqueArray.includes(point)){
        uniqueArray.push(point);
    }
    
}
console.log(uniqueArray);


const uniqueArray1=new Set(points);
console.log(uniqueArray1);

