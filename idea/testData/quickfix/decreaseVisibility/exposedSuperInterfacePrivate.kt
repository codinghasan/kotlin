// "Make Derived private" "true"

import Outer.Base

internal class Outer {
    interface Base
}

class Container {
    interface Derived : <caret>Base
}