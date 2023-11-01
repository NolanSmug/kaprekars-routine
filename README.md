# Kaprekar's Constant
Mathematician D. R. Kaprekar discovered an interesting pattern involving the number **6174**. I decided to write a
recursive algorithm demonstrating it.

## How to Compute
1. Take a 4-digit number with at least 2 unique digits (_ex_: `1110` is valid but `1111` is not).
2. Arrange the digits in descending order (`8393 -> 9833`) to get new number.
3. Arrange the digits in ascending order (`9833 -> 3389`) to get another number.
4. Calculate the difference between tht two numbers.
5. Repeat steps 2-4 until reaching `6174` (the only number that maps to itself).

## Example
**Number: `8393`**
```text
8393 descending = 9833
8393 ascending  = 3398
9833 - 3398 = 6435

6435 descending = 6543
6435 ascending  = 3456
6543 - 3456 = 3087

3087 descending = 8730
3087 ascending  = 0378
8730 - 0378 = 8352

8352 descending = 8532
8352 ascending  = 2358
8532 - 2358 = 6174

Done in 4 steps
```

## Files

### Kaprekar.java

`kaprekar(int num)` – Takes an integer and recursively computes each next number until reaching Kaprekar's constant `6174`.
Returns -1 if number is invalid.

`reverse(int[] array)` – Takes an array of integers and reverses its ordering. Used to get number in descending order
after sorting its digits into ascending order.

### kaprekar_numbers.csv  

A `.csv` file with 2 columns for each number and how many steps the algorithm ran until reaching Kaprekar's constant.

## Contact

For any inquiries or issues, please contact [Nolan Cyr](mailto:nolangcyr@gmail.com)
