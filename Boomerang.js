boomerangArray = ([5, 6, 6, 7, 6, 3, 9]);

function boomerang(boomerangArray){
    var count = 0;
    for( var i = 0; i < boomerangArray.length-2; i++){
        if(boomerangArray[i] == boomerangArray[i+2]){
            if(boomerangArray[i+1] < boomerangArray[i] || boomerangArray[i+1] > boomerangArray[i]){
                count++;
                continue;
            }
        }
    }

    return count;
}
console.log(boomerang(boomerangArray));