# Assignment Context

1. Identity Conversion
2. Widening Primitive/Reference Conversion
3. [Narrowing Primitive Conversion Optionally Followed By Boxing Conversion
Only if the expression is a compile-time constant expression of type byte, short, char, or int and the value of the constant expression is representable in the type of the variable]
4. Boxing Conversion Optionally Followed By Widening Reference Conversion
5. Unboxing Conversion Optionally Followed By Widening Primitive Conversion

# Numeric Context

1. Identity Conversion
2. Widening Primitive Conversion
3. Unboxing Conversion Optionally Followed By Widening Primitive Conversion
4. Narrowing Primitive Conversions in Choice Contexts

# Casting Context

1. Identity Conversion
2. Widening Primitive/Reference Conversion
3. Narrowing Primitive/Reference Conversion
4. Widening Primitive and Narrowing Primitive Conversion
5. Boxing Conversion Optionally Followed By Widening Reference Conversion
6. Unboxing Conversion Optionally Followed By Widening Primitive Conversion

# Invocation Context

**Strict Invocation Context**
1. Identity Conversion
2. Widening Primitive/Reference Conversion

**Loose Invocation Context**
1. Identity Conversion
2. Widening Primitive/Reference Conversion
3. Boxing Conversion Optionally Followed By Widening Reference Conversion
4. Unboxing Conversion Optionally Followed By Widening Primitive Conversion




