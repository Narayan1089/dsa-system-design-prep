fun area(shape: Shape) : Double {
    return when (shape) {
        is Circle -> 3.14 shape.r * shape.r
        is Rectangle -> shape.w * shape.h
        is Triangle -> 0.5 shape.base * shape.height
    }
}
