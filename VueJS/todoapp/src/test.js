var numbers= [10,20,30]

function reject(array, iteratorFunction){
    numbers.filter(function(number){
        return !(number > 15)
    })
}







var lessThanFifteen= reject(numbers, function(number){
    return number > 15;
})

lessThanFifteen