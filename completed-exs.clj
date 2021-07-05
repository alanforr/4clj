;; alanforr's solution to Nothing but the Truth
;; https://4clojure.com/problem/1
;; (= __ true)

true

;; alanforr's solution to Simple Math
;; https://4clojure.com/problem/2
;; (= (- 10 (* 2 3)) __)

4

;; alanforr's solution to Intro to Strings
;; https://4clojure.com/problem/3
;; (= __ (.toUpperCase "hello world"))

"HELLO WORLD"

;; alanforr's solution to Intro to Lists
;; https://4clojure.com/problem/4
;; Lists can be constructed with either a function or a quoted form.
;; 	
;; (= (list __) '(:a :b :c))
;; (= (list __) '(:a :b :c))

:a :b :c

;; alanforr's solution to Lists: conj
;; https://4clojure.com/problem/5
;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.

;; Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.

;; 	
;; (= __ (conj '(2 3 4) 1))
;; 	
;; (= __ (conj '(3 4) 2 1))

'(1 2 3 4)

;; alanforr's solution to Intro to Vectors
;; https://4clojure.com/problem/6
;; Vectors can be constructed several ways. You can compare them with lists.

;; Note: the brackets [] surrounding the blanks __ are part of the test case.
;; 	
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

:a :b :c

;; alanforr's solution to Vectors: conj
;; https://4clojure.com/problem/7
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
;; 	
;; (= __ (conj [1 2 3] 4))
;; 	
;; (= __ (conj [1 2] 3 4))

[1 2 3 4]

;; alanforr's solution to Intro to Sets
;; https://4clojure.com/problem/8
;; Sets are collections of unique values.
;; 	
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; 	
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

#{:a :b :c :d}

;; alanforr's solution to Sets: conj
;; https://4clojure.com/problem/9
;; When operating on a set, the conj function returns a new set with one or more keys "added".
;; 	
;; (= #{1 2 3 4} (conj #{1 4 3} __))

2

;; alanforr's solution to Intro to Maps
;; https://4clojure.com/problem/10
;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
;; 	
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; 	
;; (= __ (:b {:a 10, :b 20, :c 30}))

20

;; alanforr's solution to Maps: conj
;; https://4clojure.com/problem/11
;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
;; 	
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

[:b 2]

;; alanforr's solution to Intro to Sequences
;; https://4clojure.com/problem/12
;; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.
;; 	
;; (= __ (first '(3 2 1)))
;; 	
;; (= __ (second [2 3 4]))
;; 	
;; (= __ (last (list 1 2 3)))

3

;; alanforr's solution to Sequences: rest
;; https://4clojure.com/problem/13
;; The rest function will return all the items of a sequence except the first.
;; 	
;; (= __ (rest [10 20 30 40]))

[20 30 40]

;; alanforr's solution to Intro to Functions
;; https://4clojure.com/problem/14
;; Clojure has many different ways to create functions.
;; 	
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; 	
;; (= __ ((fn [x] (+ x 5)) 3))
;; 	
;; (= __ (#(+ % 5) 3))
;; 	
;; (= __ ((partial + 5) 3))

8

;; alanforr's solution to Double Down
;; https://4clojure.com/problem/15
;; Write a function which doubles a number.
;; 	
;; (= (__ 2) 4)
;; 	
;; (= (__ 3) 6)
;; 	
;; (= (__ 11) 22)
;; 	
;; (= (__ 7) 14)

(fn [x] (* 2 x))

;; alanforr's solution to Hello World
;; https://4clojure.com/problem/16
;; Write a function which returns a personalized greeting.
;; 	
;; (= (__ "Dave") "Hello, Dave!")
;; 	
;; (= (__ "Jenn") "Hello, Jenn!")
;; 	
;; (= (__ "Rhea") "Hello, Rhea!")

(fn [x] (str "Hello, " x "!"))

;; alanforr's solution to Sequences: map
;; https://4clojure.com/problem/17
;; Write a function which returns a personalized greeting.
;; 	
;; (= (__ "Dave") "Hello, Dave!")
;; 	
;; (= (__ "Jenn") "Hello, Jenn!")
;; 	
;; (= (__ "Rhea") "Hello, Rhea!")

'(6 7 8)

;; alanforr's solution to Sequences: filter
;; https://4clojure.com/problem/18
;; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
;; 	
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

'(6 7)

;; alanforr's solution to Local bindings
;; https://4clojure.com/problem/35
;; Clojure lets you give local names to values using the special let-form.
;; 	
;; (= __ (let [x 5] (+ 2 x)))
;; 	
;; (= __ (let [x 3, y 10] (- y x)))
;; 	
;; (= __ (let [x 21] (let [y 3] (/ x y))))

7

;; alanforr's solution to Let it Be
;; https://4clojure.com/problem/36
;; Can you bind x, y, and z so that these are all true?
;; 	
;; (= 10 (let __ (+ x y)))
;; 	
;; (= 4 (let __ (+ y z)))
;; 	
;; (= 1 (let __ z))

[x 7 y 3 z 1]

;; alanforr's solution to Regular Expressions
;; https://4clojure.com/problem/37
;; Regex patterns are supported with a special reader macro.
;; 	
;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

"ABC"

;; alanforr's solution to Intro to Reduce
;; https://4clojure.com/problem/64
;; Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
;; 	
;; (= 15 (reduce __ [1 2 3 4 5]))
;; 	
;; (=  0 (reduce __ []))
;; 	
;; (=  6 (reduce __ 1 [2 3]))

+

;; alanforr's solution to Simple Recursion
;; https://4clojure.com/problem/57
;; A recursive function is a function which calls itself. This is one of the fundamental techniques used in functional programming.
;; 	
;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

'(5 4 3 2 1)

;; alanforr's solution to Rearranging Code: ->
;; https://4clojure.com/problem/71
;; The -> macro threads an expression x through a variable number of forms. First, x is inserted as the second item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the second item in the second form, making a list of that form if necessary. This process continues for all the forms. Using -> can sometimes make your code more readable.
;; 	
;; (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
;;    (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
;;    5)

last

;; alanforr's solution to Recurring Theme
;; https://4clojure.com/problem/68
;; Clojure only has one non-stack-consuming looping construct: recur. Either a function or a loop can be used as the recursion point. Either way, recur rebinds the bindings of the recursion point to the values it is passed. Recur must be called from the tail-position, and calling it elsewhere will result in an error.
;; 	
;; (= __
;;   (loop [x 5
;;          result []]
;;     (if (> x 0)
;;       (recur (dec x) (conj result (+ 2 x)))
;;       result)))

'(7 6 5 4 3)

;; alanforr's solution to Rearranging Code: ->>
;; https://4clojure.com/problem/72
;; The ->> macro threads an expression x through a variable number of forms. First, x is inserted as the last item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the last item in the second form, making a list of that form if necessary. This process continues for all the forms. Using ->> can sometimes make your code more readable.
;; 	
;; (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
;;    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
;;    11)

apply +

;; alanforr's solution to A nil key
;; https://4clojure.com/problem/134
;; Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.
;; 	
;; (true?  (__ :a {:a nil :b 2}))
;; 	
;; (false? (__ :b {:a nil :b 2}))
;; 	
;; (false? (__ :c {:a nil :b 2}))
;; (false? (__ :c {:a nil :b 2}))

(fn [x y] (and (contains? y x) (nil? (y x))))

;; alanforr's solution to For the win
;; https://4clojure.com/problem/145
;; Clojure's for macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s). It can take some time to understand how to use it properly, but that investment will be paid back with clear, concise sequence-wrangling later. With that in mind, read over these for expressions and try to see how each of them produces the same result.
;; 	
;; (= __ (for [x (range 40)
;;             :when (= 1 (rem x 4))]
;;         x))
;; 	
;; (= __ (for [x (iterate #(+ 4 %) 0)
;;             :let [z (inc x)]
;;             :while (< z 40)]
;;         z))
;; 	
;; (= __ (for [[x y] (partition 2 (range 20))]
;;         (+ x y)))

'(1 5 9 13 17 21 25 29 33 37)

;; alanforr's solution to Logical falsity and truth
;; https://4clojure.com/problem/162
;; In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.
;; 	
;; (= __ (if-not false 1 0))
;; 	
;; (= __ (if-not nil 1 0))
;; 	
;; (= __ (if true 1 0))
;; 	
;; (= __ (if [] 1 0))
;; 	
;; (= __ (if [0] 1 0))
;; 	
;; (= __ (if 0 1 0))
;; 	
;; (= __ (if 1 1 0))

1

;; alanforr's solution to Subset and Superset
;; https://4clojure.com/problem/161
;; Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.
;; 	
;; (clojure.set/superset? __ #{2})
;; 	
;; (clojure.set/subset? #{1} __)
;; 	
;; (clojure.set/superset? __ #{1 2})
;; 	
;; (clojure.set/subset? #{1 2} __)

#{1 2}

;; alanforr's solution to Map Defaults
;; https://4clojure.com/problem/156
;; When retrieving values from a map, you can specify default values in case the key is not found:

;; (= 2 (:foo {:bar 0, :baz 1} 2))

;; However, what if you want the map itself to contain the default values? Write a function which takes a default value and a sequence of keys and constructs a map.
;; 	
;; (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})
;; 	
;; (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
;; 	
;; (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})

(fn [x y] (let [xs (repeat (count y) x)
               z (map vector y xs)]
           (into {} z)))

;; alanforr's solution to Last Element
;; https://4clojure.com/problem/19
;; Special Restrictions
;; last
;; Write a function which returns the last element in a sequence.
;; 	
;; (= (__ [1 2 3 4 5]) 5)
;; 	
;; (= (__ '(5 4 3)) 3)
;; 	
;; (= (__ ["b" "c" "d"]) "d")

(fn [x] (nth x (- (count x) 1)))

;; alanforr's solution to Penultimate Element
;; https://4clojure.com/problem/20
;; Write a function which returns the second to last element from a sequence.
;; 	
;; (= (__ (list 1 2 3 4 5)) 4)
;; 	
;; (= (__ ["a" "b" "c"]) "b")
;; 	
;; (= (__ [[1 2] [3 4]]) [1 2])

(fn [x] (nth x (- (count x) 2)))

;; alanforr's solution to Nth Element
;; https://4clojure.com/problem/21
;; Special Restrictions
;; nth
;; Write a function which returns the Nth element from a sequence.
;; 	
;; (= (__ '(4 5 6 7) 2) 6)
;; 	
;; (= (__ [:a :b :c] 0) :a)
;; 	
;; (= (__ [1 2 3 4] 1) 2)
;; 	
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(fn [x n] (first (drop n x)))

;; alanforr's solution to Count a Sequence
;; https://4clojure.com/problem/22
;; Special Restrictions
;; count
;; Write a function which returns the total number of elements in a sequence.
;; 	
;; (= (__ '(1 2 3 3 1)) 5)
;; 	
;; (= (__ "Hello World") 11)
;; 	
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; 	
;; (= (__ '(13)) 1)
;; 	
;; (= (__ '(:a :b :c)) 3)

(fn [x]
  (loop [ct 0 thing x]
    (if (empty? thing)
        ct
        (recur (inc ct) (rest thing)))))

;; alanforr's solution to Sum It All Up
;; https://4clojure.com/problem/24
;; Write a function which returns the sum of a sequence of numbers.
;; 	
;; (= (__ [1 2 3]) 6)
;; 	
;; (= (__ (list 0 -2 5 5)) 8)
;; 	
;; (= (__ #{4 2 1}) 7)
;; 	
;; (= (__ '(0 0 -1)) -1)
;; 	
;; (= (__ '(1 10 3)) 14)

reduce +

;; alanforr's solution to Find the odd numbers
;; https://4clojure.com/problem/25
;; Write a function which returns only the odd numbers from a sequence.
;; 	
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; 	
;; (= (__ [4 2 1 6]) '(1))
;; 	
;; (= (__ [2 2 4 6]) '())
;; 	
;; (= (__ [1 1 1 3]) '(1 1 1 3))

filter odd?

;; alanforr's solution to Reverse a Sequence
;; https://4clojure.com/problem/23
;; Special Restrictions
;; reverse
;; rseq
;; Write a function which reverses a sequence.
;; 	
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; 	
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; 	
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(fn [x]
  (let [revable (into [] x)
        cx (count x)
        ln (dec' cx)]
    (map #(nth revable (-' ln %)) (range cx))))

;; alanforr's solution to Palindrome Detector
;; https://4clojure.com/problem/27
;; Write a function which returns true if the given sequence is a palindrome.

;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;; 	
;; (false? (__ '(1 2 3 4 5)))
;; 	
;; (true? (__ "racecar"))
;; 	
;; (true? (__ [:foo :bar :foo]))
;; 	
;; (true? (__ '(1 1 3 3 1 1)))
;; 	
;; (false? (__ '(:a :b :c)))

(fn [x] (= (clojure.string/join x) (clojure.string/join (reverse x))))

;; alanforr's solution to Fibonacci Sequence
;; https://4clojure.com/problem/26
;; Write a function which returns the first X fibonacci numbers.
;; 	
;; (= (__ 3) '(1 1 2))
;; 	
;; (= (__ 6) '(1 1 2 3 5 8))
;; 	
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

(fn [n]
  (letfn [(fib [a b] (cons a (lazy-seq (fib b (+ b a)))))
          (fib-n [a b n] (take n (fib a b)))]
    (fib-n 1 1 n)))

;; alanforr's solution to Maximum value
;; https://4clojure.com/problem/38
;; Special Restrictions
;; max
;; max-key
;; Write a function which takes a variable number of parameters and returns the maximum value.
;; 	
;; (= (__ 1 8 3 4) 8)
;; 	
;; (= (__ 30 20) 30)
;; 	
;; (= (__ 45 67 11) 67)

(fn [& x]
      (loop [cnt 0 thing (first x)]
        (if (= cnt (count x))
          thing
          (recur (inc cnt) (if (> (nth x cnt) thing) (nth x cnt) thing)))))

;; alanforr's solution to Get the Caps
;; https://4clojure.com/problem/29
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; 	
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; 	
;; (empty? (__ "nothing"))
;; 	
;; (= (__ "$#A(*&987Zf") "AZ")

(fn [x] (clojure.string/join (re-seq #"[A-Z]" x)))

;; alanforr's solution to Duplicate a Sequence
;; https://4clojure.com/problem/32
;; Write a function which duplicates each element of a sequence.
;; 	
;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
;; 	
;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;; 	
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
;; 	
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(fn [x] (interleave x x))

;; alanforr's solution to Intro to some
;; https://4clojure.com/problem/48
;; The some function takes a predicate function and a collection. It returns the first logical true value of (predicate x) where x is an item in the collection.
;; 	
;; (= __ (some #{2 7 6} [5 6 7 8]))
;; 	
;; (= __ (some #(when (even? %) %) [5 6 7 8]))

6

;; alanforr's solution to Implement range
;; https://4clojure.com/problem/34
;; Special Restrictions
;; range
;; Write a function which creates a list of all integers in a given range.
;; 	
;; (= (__ 1 4) '(1 2 3))
;; 	
;; (= (__ -2 2) '(-2 -1 0 1))
;; 	
;; (= (__ 5 8) '(5 6 7))

(fn [x y] (take (- y x) (iterate inc x)))

;; alanforr's solution to Flatten a Sequence
;; https://4clojure.com/problem/28
;; Special Restrictions
;; flatten
;; Write a function which flattens a sequence.
;; 	
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; 	
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; 	
;; (= (__ '((((:a))))) '(:a))

(fn [s]
  (loop [res [] left s]
    (cond
     (empty? left) res
     (coll? (first left)) (recur res (concat (first left) (rest left)))
     :else (recur (conj res (first left)) (rest left)))))

;; alanforr's solution to Interleave Two Seqs
;; https://4clojure.com/problem/39
;; Special Restrictions
;; interleave
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; 	
;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;; 	
;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;; 	
;; (= (__ [1 2 3 4] [5]) [1 5])
;; 	
;; (= (__ [30 20] [25 15]) [30 25 20 15])

(fn [s1 s2] (mapcat #(vector %1 %2) s1 s2))

;; alanforr's solution to Factorial Fun
;; https://4clojure.com/problem/42
;; Write a function which calculates factorials.
;; 	
;; (= (__ 1) 1)
;; 	
;; (= (__ 3) 6)
;; 	
;; (= (__ 5) 120)
;; 	
;; (= (__ 8) 40320)

(fn [n] (reduce * (range 1 (+ n 1))))

;; alanforr's solution to Compress a Sequence
;; https://4clojure.com/problem/30
;; Write a function which removes consecutive duplicates from a sequence.
;; 	
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; 	
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; 	
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(fn [s]
  (loop [res [(first s)] left (rest s)]
    (cond
     (empty? left) res
     (= (last res) (first left)) (recur res (rest left))
     :else (recur (conj res (first left)) (rest left)))))

;; alanforr's solution to Contain Yourself
;; https://4clojure.com/problem/47
;; The contains? function checks if a KEY is present in a given collection. This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;; 	
;; (contains? #{4 5 6} __)
;; 	
;; (contains? [1 1 1 1 1] __)
;; 	
;; (contains? {4 :a 2 :b} __)
;; 	
;; (not (contains? [1 2 4] __))

4

;; alanforr's solution to Replicate a Sequence
;; https://4clojure.com/problem/33
;; Write a function which replicates each element of a sequence a variable number of times.
;; 	
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; 	
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; 	
;; (= (__ [4 5 6] 1) '(4 5 6))
;; 	
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; 	
;; (= (__ [44 33] 2) [44 44 33 33])

(fn [s n] (mapcat #(repeat n %) s))

;; alanforr's solution to Intro to Iterate
;; https://4clojure.com/problem/45
;; The iterate function can be used to produce an infinite lazy sequence.
;; 	
;; (= __ (take 5 (iterate #(+ 3 %) 1)))

'(1 4 7 10 13)

;; alanforr's solution to Interpose a Seq
;; https://4clojure.com/problem/40
;; Special Restrictions
;; interpose
;; Write a function which separates the items of a sequence by an arbitrary value.
;; 	
;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
;; 	
;; (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;; 	
;; (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

(fn [el s]
  (rest
   (interleave
    (repeat (inc (count s)) el)
    s)))

;; alanforr's solution to Pack a Sequence
;; https://4clojure.com/problem/31
;; Write a function which packs consecutive duplicates into sub-lists.
;; 	
;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;; 	
;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;; 	
;; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

(fn [s]
  (loop [res [] left s]
    (if
      (empty? left) res
      (recur (concat res [(take-while #(= (first left) %) left)])
             (drop-while #(= (first left) %) left)))))

;; alanforr's solution to Drop Every Nth Item
;; https://4clojure.com/problem/41
;; Write a function which drops every Nth item from a sequence.
;; 	
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; 	
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; 	
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

(fn [x n]
      (let
        [indices (remove #(= (- n 1) (mod % n)) (range 0 (count x)))]
        (map #(nth x %) indices)))

;; alanforr's solution to Intro to Destructuring
;; https://4clojure.com/problem/52
;; Let bindings and function parameter lists support destructuring.
;; 	
;; (= [2 4] (let [[a b c d e] [0 1 2 3 4]] __))

(list c e)

;; alanforr's solution to Split a sequence
;; https://4clojure.com/problem/49
;; Special Restrictions
;; split-at
;; Write a function which will split a sequence into two parts.
;; 	
;; (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;; 	
;; (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;; 	
;; (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(fn [n s] [(take n s) (drop n s)])

;; alanforr's solution to Advanced Destructuring
;; https://4clojure.com/problem/51
;; Here is an example of some more sophisticated destructuring.
;; 	
;; (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))

[1 2 3 4 5]

;; alanforr's solution to A Half-Truth
;; https://4clojure.com/problem/83
;; Write a function which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.
;; 	
;; (= false (__ false false))
;; 	
;; (= true (__ true false))
;; 	
;; (= false (__ true))
;; 	
;; (= true (__ false true false))
;; 	
;; (= false (__ true true true))
;; 	
;; (= true (__ true true true false))

(fn [& x]
  (let [ctruex (count (filter true? x))
        cx (count x)]
    (cond
     (= ctruex cx) false
     (zero? ctruex) false
     :else true)))

;; alanforr's solution to Map Construction
;; https://4clojure.com/problem/61
;; Special Restrictions
;; zipmap
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; 	
;; (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;; 	
;; (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;; 	
;; (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

(fn [c1 c2]
  (let [kvv (map vector c1 c2)
        kvm (map #(apply hash-map %) kvv)]
    (apply merge kvm)))

;; alanforr's solution to Greatest Common Divisor
;; https://4clojure.com/problem/66
;; Given two integers, write a function which returns the greatest common divisor.
;; 	
;; (= (__ 2 4) 2)
;; 	
;; (= (__ 10 5) 5)
;; 	
;; (= (__ 5 7) 1)
;; 	
;; (= (__ 1023 858) 33)

(fn [a b]
  (loop [c a d b]
    (cond
     (= d 0) c
     :else (recur d (rem c d)))))

;; alanforr's solution to Comparisons
;; https://4clojure.com/problem/166
;; For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any operator but = or ≠ will work). Write a function that takes three arguments, a less than operator for the data and two items to compare. The function should return a keyword describing the relationship between the two items. The keywords for the relationship between x and y are as follows:
;; x = y → :eq
;; x > y → :gt
;; x < y → :lt

;; 	
;; (= :gt (__ < 5 1))
;; 	
;; (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum"))
;; 	
;; (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))
;; 	
;; (= :gt (__ > 0 2))
 

(fn [compy x y]
  (cond
   (compy x y) :lt
   (and (not (compy x y)) (not (compy y x))) :eq
   :else :gt))

;; alanforr's solution to Set Intersection
;; https://4clojure.com/problem/81
;; Special Restrictions
;; intersection
;; Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.
;; 	
;; (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
;; 	
;; (= (__ #{0 1 2} #{3 4 5}) #{})
;; 	
;; (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

(fn [s1 s2]
  (clojure.set/difference s1 (clojure.set/difference s1 s2)))

;; alanforr's solution to Re-implement Iterate
;; https://4clojure.com/problem/62
;; Special Restrictions
;; iterate
;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;; 	
;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; 	
;; (= (take 100 (__ inc 0)) (take 100 (range)))
;; 	
;; (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

(fn [f x]
  (letfn [(iter [g y] (cons y (lazy-seq (iter g (g y)))))]
    (iter f x)))

;; alanforr's solution to Simple closures
;; https://4clojure.com/problem/107
;; Lexical scope and first-class functions are two of the most basic building blocks of a functional language like Clojure. When you combine the two together, you get something very powerful called lexical closures. With these, you can exercise a great deal of control over the lifetime of your local bindings, saving their values for use later, long after the code you're running now has finished.

;; It can be hard to follow in the abstract, so let's build a simple closure. Given a positive integer n, return a function (f x) which computes xn. Observe that the effect of this is to preserve the value of n for use outside the scope in which it is defined.


;; 	
;; (= 256 ((__ 2) 16),
;;        ((__ 8) 2))
;; 	
;; (= [1 8 27 64] (map (__ 3) [1 2 3 4]))
;; 	
;; (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))

(fn [b]
  (letfn [(expon [n x] (reduce * (repeat n x)))]
    (partial expon b) ))

;; alanforr's solution to Product Digits
;; https://4clojure.com/problem/99
;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; 	
;; (= (__ 1 1) [1])
;; 	
;; (= (__ 99 9) [8 9 1])
;; 	
;; (= (__ 999 99) [9 8 9 0 1])

(fn [x y]
  (let [ds (str (* x y))
        dstrs (map str ds)]
    (map read-string dstrs)))

;; alanforr's solution to Cartesian Product
;; https://4clojure.com/problem/90
;; Write a function which calculates the Cartesian product of two sets.
;; 	
;; (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
;;    #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
;;      ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
;;      ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
;; 	
;; (= (__ #{1 2 3} #{4 5})
;;    #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
;; 	
;; (= 300 (count (__ (into #{} (range 10))
;;                   (into #{} (range 30)))))

(fn [xs ys]
  (set (for [x xs y ys] [x y])))


;; alanforr's solution to Group a Sequence
;; https://4clojure.com/problem/63
;; Special Restrictions
;; group-by
;; Given a function f and a sequence s, write a function which returns a map. The keys should be the values of f applied to each item in s. The value at each key should be a vector of corresponding items in the order they appear in s.
;; 	
;; (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
;; 	
;; (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
;;    {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
;; 	
;; (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
;;    {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

(fn [f s]
  (let [vs (distinct (map f s))
        mv (fn [v] {v (filter #(= v (f %)) s)})
        ms (map mv vs)]
    (apply merge ms)))

;; alanforr's solution to Read a binary number
;; https://4clojure.com/problem/122
;; Convert a binary number, provided in the form of a string, to its numerical value.
;; 	
;; (= 0     (__ "0"))
;; 	
;; (= 7     (__ "111"))
;; 	
;; (= 8     (__ "1000"))
;; 	
;; (= 9     (__ "1001"))
;; 	
;; (= 255   (__ "11111111"))
;; 	
;; (= 1365  (__ "10101010101"))
;; 	
;; (= 65535 (__ "1111111111111111"))

(fn [a]
  (letfn [(rds [s] (map #(read-string (str %)) s))
          (expon [b n] (if (zero? n) 1 (reduce *' (repeat n b))))
          (convertfrombin [s] (reduce +' (map-indexed (fn [i d] (*' d (expon 2 i))) (reverse (rds s)))))]
    (convertfrombin a)))

;; alanforr's solution to Symmetric Difference
;; https://4clojure.com/problem/88
;; Write a function which returns the symmetric difference of two sets. The symmetric difference is the set of items belonging to one but not both of the two sets.
;; 	
;; (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
;; 	
;; (= (__ #{:a :b :c} #{}) #{:a :b :c})
;; 	
;; (= (__ #{} #{4 5 6}) #{4 5 6})
;; 	
;; (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

(fn [x y] (clojure.set/union (clojure.set/difference x y) (clojure.set/difference y x)))

;; alanforr's solution to dot product
;; https://4clojure.com/problem/143
;; Create a function that computes the dot product of two sequences. You may assume that the vectors will have the same length.
;; 	
;; (= 0 (__ [0 1 0] [1 0 0]))
;; 	
;; (= 3 (__ [1 1 1] [1 1 1]))
;; 	
;; (= 32 (__ [1 2 3] [4 5 6]))
;; 	
;; (= 256 (__ [2 5 6] [100 10 1]))

(fn [x y]
      (reduce +
	      (map #(* (nth x %) (nth y %)) (range (count x)))))

;; alanforr's solution to Through the Looking Class
;; https://4clojure.com/problem/126
;; Enter a value which satisfies the following:
;; 	
;; (let [x __]
;;   (and (= (class x) x) x))

Class

;; alanforr's solution to Infix Calculator
;; https://4clojure.com/problem/135
;; Your friend Joe is always whining about Lisps using the prefix notation for math. Show him how you could easily write a function that does math using the infix notation. Is your favorite language that flexible, Joe? Write a function that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.
;; 	
;; (= 7  (__ 2 + 5))
;; 	
;; (= 42 (__ 38 + 48 - 2 / 2))
;; 	
;; (= 8  (__ 10 / 2 - 1 * 2))
;; 	
;; (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))

(fn [& x]
  (loop [acc (first x) left (partition 2 (rest x))]
    (if (empty? left) acc
        (let [op (first (first left))
              secarg (second (first left))]
          (recur (op acc secarg) (rest left))))))

;; alanforr's solution to Indexing Sequences
;; https://4clojure.com/problem/157
;; Transform a sequence into a sequence of pairs containing the original elements along with their index.
;; 	
;; (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])
;; 	
;; (= (__ [0 1 3]) '((0 0) (1 1) (3 2)))
;; 	
;; (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])

(fn [x] (map vector x (range (count x))))

;; alanforr's solution to Pascal's Triangle
;; https://4clojure.com/problem/97
;; Pascal's triangle is a triangle of numbers computed using the following rules:
;; - The first row is 1.
;; - Each successive row is computed by adding together adjacent numbers in the row above, and adding a 1 to the beginning and end of the row.

;; Write a function which returns the nth row of Pascal's Triangle.
;; 	
;; (= (__ 1) [1])
;; 	
;; (= (map __ (range 1 6))
;;    [     [1]
;;         [1 1]
;;        [1 2 1]
;;       [1 3 3 1]
;;      [1 4 6 4 1]])
;; 	
;; (= (__ 11)
;;    [1 10 45 120 210 252 210 120 45 10 1])
;; (= (__ 11)
;;    [1 10 45 120 210 252 210 120 45 10 1])

(fn [x]
  (letfn
    [(factorial [a] (apply * (range 1 (inc a))))
     (ptel [n k]
           (/ (factorial n) (* (factorial k) (factorial (- n k)))))]
    (map #(ptel (dec x) %) (range x))))

;; alanforr's solution to Re-implement Map
;; https://4clojure.com/problem/118
;; Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.
;; Special Restrictions
;; map
;; map-indexed
;; mapcat
;; for
;; 	
;; (= [3 4 5 6 7]
;;    (__ inc [2 3 4 5 6]))
;; 	
;; (= (repeat 10 nil)
;;    (__ (fn [_] nil) (range 10)))
;; 	
;; (= [1000000 1000001]
;;    (->> (__ inc (range))
;;         (drop (dec 1000000))
;;         (take 2)))

(fn [g y]
  (letfn [(exmap
           ([f x]
            (lazy-seq
             (when-let [thing (seq x)]
               (cons (f (first thing)) (exmap f (rest thing)))))))]
    (exmap g y)))

;; alanforr's solution to Sum of square of digits
;; https://4clojure.com/problem/120
;; Write a function which takes a collection of integers as an argument. Return the count of how many elements are smaller than the sum of their squared component digits. For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
;; 	
;; (= 8 (__ (range 10)))
;; 	
;; (= 19 (__ (range 30)))
;; 	
;; (= 50 (__ (range 100)))
;; 	
;; (= 50 (__ (range 1000)))

(fn [x]
  (letfn [(ssd [n]
            (let [dst (map str (str n))
                  ds (map read-string dst)]
              (reduce + (map #(* % %) ds))))
          (smssd [c]
            (let [ssds (map ssd c)
                  inds (filter #(< (nth c %) (nth ssds %)) (range (count c)))]
              (count inds)))]
    (smssd x)))

;; alanforr's solution to To Tree, or not to Tree
;; https://4clojure.com/problem/95
;; Write a predicate which checks whether or not a given sequence represents a binary tree. Each node in the tree must have a value, a left child, and a right child.
;; 	
;; (= (__ '(:a (:b nil nil) nil))
;;    true)
;; 	
;; (= (__ '(:a (:b nil nil)))
;;    false)
;; 	
;; (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
;;    true)
;; 	
;; (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
;;    false)
;; 	
;; (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
;;    true)
;; 	
;; (= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
;;    false)
;; 	
;; (= (__ '(:a nil ()))
;;    false)
 

(fn [x]
  (letfn [(collnotempty [x] (and (coll? x) (not (empty? x))))
          (nil-coll-nonempty? [x] (or (nil? x) (collnotempty x)))
          (treelike [x] (and (= (count x) 3)
                             (nil-coll-nonempty? (nth x 1))
                             (nil-coll-nonempty? (nth x 2))))]
    (loop [curr x]
      (cond
       (and (treelike curr) (not (empty? curr))) (recur (first (filter collnotempty curr)))
       (empty? curr) true
       :else false))))

;; alanforr's solution to Recognize Playing Cards
;; https://4clojure.com/problem/128
;; A standard American deck of playing cards has four suits - spades, hearts, diamonds, and clubs - and thirteen cards in each suit. Two is the lowest rank, followed by other integers up to ten; then the jack, queen, king, and ace.

;; It's convenient for humans to represent these cards as suit/rank pairs, such as H5 or DQ: the heart five and diamond queen respectively. But these forms are not convenient for programmers, so to write a card game you need some way to parse an input string into meaningful components. For purposes of determining rank, we will define the cards to be valued from 0 (the two) to 12 (the ace)

;; Write a function which converts (for example) the string "SJ" into a map of {:suit :spade, :rank 9}. A ten will always be represented with the single character "T", rather than the two characters "10".


;; 	
;; (= {:suit :diamond :rank 10} (__ "DQ"))
;; 	
;; (= {:suit :heart :rank 3} (__ "H5"))
;; 	
;; (= {:suit :club :rank 12} (__ "CA"))
;; 	
;; (= (range 13) (map (comp :rank __ str)
;;                    '[S2 S3 S4 S5 S6 S7
;;                      S8 S9 ST SJ SQ SK SA]))

(fn [a]
  (let [ranking (fn [x]
                  (cond
                   (= x \T) 8
		           (= x \J) 9
		           (= x \Q) 10
		           (= x \K) 11
		           (= x \A) 12
                   :else (- (read-string (str x)) 2)))
        suit (fn [y] (cond
                     (= y \D) :diamond
		             (= y \H) :heart
		             (= y \S) :spade
		             (= y \C) :club))]
    {:suit (suit (nth a 0))
     :rank (ranking (nth a 1))}))


;; alanforr's solution to Least Common Multiple
;; https://4clojure.com/problem/100
;; Write a function which calculates the least common multiple. Your function should accept a variable number of positive integers or ratios.
;; 	
;; (== (__ 2 3) 6)
;; 	
;; (== (__ 5 3 7) 105)
;; 	
;; (== (__ 1/3 2/5) 2)
;; 	
;; (== (__ 3/4 1/6) 3/2)
;; 	
;; (== (__ 7 5/7 2 3/5) 210)

(fn [e & f]
  (letfn [(gcd [a b] (loop [c a d b]
                       (if (= d 0) c
                         (recur d (rem c d)))))
          (lcm2 [x y] (/ (* x y) (gcd x y)))]
    (let [cf (count f)]
      (loop [g e num 0]
        (if (= num cf) g
            (recur (lcm2 g (nth f num)) (inc num)))))))

;; alanforr's solution to Intro to Destructuring 2
;; https://4clojure.com/problem/173
;; Sequential destructuring allows you to bind symbols to parts of sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete the bindings so all let-parts evaluate to 3.
;; 	
;; (= 3
;;   (let [[__] [+ (range 3)]] (apply __))
;;   (let [[[__] b] [[+ 1] 2]] (__ b))
;;   (let [[__] [inc 2]] (__)))
;; (= 3
;;   (let [[__] [+ (range 3)]] (apply __))
;;   (let [[[__] b] [[+ 1] 2]] (__ b))
;;   (let [[__] [inc 2]] (__)))

x y

;; alanforr's solution to Pascal's Trapezoid
;; https://4clojure.com/problem/147
;; Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in Pascal's Triangle. For example, for [3 1 2], the next row is [3 4 3 2].
;; https://en.wikipedia.org/wiki/Pascal's_triangle
;; Beware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an arithmetic operator like + and the result is too large to fit into a 64-bit integer, an exception is thrown. You can use +' to indicate that you would rather overflow into Clojure's slower, arbitrary-precision bigint.


;; 	
;; (= (second (__ [2 3 2])) [2 5 5 2])
;; 	
;; (= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
;; 	
;; (= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]])
;; 	
;; (= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2]))))

(fn [ir]
  (letfn [(nextrowtrapezoid [r]
            (let [inds (range (dec' (count r)))
                  addfn (fn [n] (+' (nth r n) (nth r (inc' n))))
                  mid (map addfn inds)]
              (concat [(first r)] mid [(last r)])))]
    (iterate nextrowtrapezoid ir)))

;; alanforr's solution to Beauty is Symmetry
;; https://4clojure.com/problem/96
;; Let us define a binary tree as "symmetric" if the left half of the tree is the mirror image of the right half of the tree. Write a predicate to determine whether or not a given binary tree is symmetric. (see To Tree, or not to Tree for a reminder on the tree representation we're using).
;; 	
;; (= (__ '(:a (:b nil nil) (:b nil nil))) true)
;; 	
;; (= (__ '(:a (:b nil nil) nil)) false)
;; 	
;; (= (__ '(:a (:b nil nil) (:c nil nil))) false)
;; 	
;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
;;    true)
;; 	
;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
;;    false)
;; 	
;; (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
;;           [2 [3 nil [4 [6 nil nil] nil]] nil]])
;;    false)

(fn [t]
  (letfn [(rev-leaves [[b1 b2 b3]] [b1 b3 b2])
          (rev-tree [t]
            (let [rlt (rev-leaves t)
                  rlfn (fn [l] (if (coll? l) (rev-tree l) l))]
              (map rlfn (concat [(first rlt)] (rest rlt)))))
          (symm? [[t1 t2 t3]] (= t2 (rev-tree t3)))]
    (symm? t)))

;; alanforr's solution to Trees into tables
;; https://4clojure.com/problem/146
;; Because Clojure's for macro allows you to "walk" over multiple sequences in a nested fashion, it is excellent for transforming all sorts of sequences. If you don't want a sequence as your final output (say you want a map), you are often still best-off using for, because you can produce a sequence and feed it into a map, for example.

;; For this problem, your goal is to "flatten" a map of hashmaps. Each key in your output map should be the "path"1 that you would have to take in the original map to get to a value, so for example {1 {2 3}} should result in {[1 2] 3}. You only need to flatten one level of maps: if one of the values is a map, just leave it alone.

;; 1 That is, (get-in original [k1 k2]) should be the same as (get result [k1 k2])


;; 	
;; (= (__ '{a {p 1, q 2}
;;          b {m 3, n 4}})
;;    '{[a p] 1, [a q] 2
;;      [b m] 3, [b n] 4})
;; 	
;; (= (__ '{[1] {a b c d}
;;          [2] {q r s t u v w x}})
;;    '{[[1] a] b, [[1] c] d,
;;      [[2] q] r, [[2] s] t,
;;      [[2] u] v, [[2] w] x})
;; 	
;; (= (__ '{m {1 [a b c] 3 nil}})
;;    '{[m 1] [a b c], [m 3] nil})

(fn [m]
  (let [km (for [k (keys m)] (conj [k] (keys (m k))))
        keyfn (fn [k] (for [x (second k)] [(first k) x]))
        nks (mapcat keyfn km)
        valfn (fn [[a b]] ((m a) b))
        nmc (for [nk nks] [nk (valfn nk)])]
    (into {} nmc)))

;; alanforr's solution to Pairwise Disjoint Sets
;; https://4clojure.com/problem/153
;; Given a set of sets, create a function which returns true if no two of those sets have any elements in common1 and false otherwise. Some of the test cases are a bit tricky, so pay a little more attention to them.

;; 1 Such sets are usually called pairwise disjoint or mutually disjoint.

;; 	
;; (= (__ #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
;;    true)
;; 	
;; (= (__ #{#{:a :b :c :d :e}
;;          #{:a :b :c :d}
;;          #{:a :b :c}
;;          #{:a :b}
;;          #{:a}})
;;    false)
;; 	
;; (= (__ #{#{[1 2 3] [4 5]}
;;          #{[1 2] [3 4 5]}
;;          #{[1] [2] 3 4 5}
;;          #{1 2 [3 4] [5]}})
;;    true)
;; 	
;; (= (__ #{#{'a 'b}
;;          #{'c 'd 'e}
;;          #{'f 'g 'h 'i}
;;          #{''a ''c ''f}})
;;    true)
;; 	
;; (= (__ #{#{'(:x :y :z) '(:x :y) '(:z) '()}
;;          #{#{:x :y :z} #{:x :y} #{:z} #{}}
;;          #{'[:x :y :z] [:x :y] [:z] [] {}}})
;;    false)
;; 	
;; (= (__ #{#{(= "true") false}
;;          #{:yes :no}
;;          #{(class 1) 0}
;;          #{(symbol "true") 'false}
;;          #{(keyword "yes") ::no}
;;          #{(class '1) (int \0)}})
;;    false)
;; 	
;; (= (__ #{#{distinct?}
;;          #{#(-> %) #(-> %)}
;;          #{#(-> %) #(-> %) #(-> %)}
;;          #{#(-> %) #(-> %) #(-> %)}})
;;    true)
;; 	
;; (= (__ #{#{(#(-> *)) + (quote mapcat) #_ nil}
;;          #{'+ '* mapcat (comment mapcat)}
;;          #{(do) set contains? nil?}
;;          #{, , , #_, , empty?}})
;;    false)

(fn [s]
  (let [tot (reduce + (map count s))
        over (set (mapcat identity s))]
    (= tot (count over))))

;; alanforr's solution to Flipping out
;; https://4clojure.com/problem/46
;; Write a higher-order function which flips the order of the arguments of an input function.
;; 	
;; (= 3 ((__ nth) 2 [1 2 3 4 5]))
;; 	
;; (= true ((__ >) 7 8))
;; 	
;; (= 4 ((__ quot) 2 8))
;; 	
;; (= [1 2 3] ((__ take) [1 2 3 4 5] 3))

(fn [f] (fn [& args] (apply f (reverse args))))

;; alanforr's solution to Rotate Sequence
;; https://4clojure.com/problem/44
;; Write a function which can rotate a sequence in either direction.
;; 	
;; (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;; 	
;; (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;; 	
;; (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;; 	
;; (= (__ 1 '(:a :b :c)) '(:b :c :a))
;; 	
;; (= (__ -4 '(:a :b :c)) '(:c :a :b))

(fn [rott b]
  (letfn [(rotation-indices [a r]
                            (map #(mod (+ % r) (count a)) (range (count a))))]
    (map #(nth b %) (rotation-indices b rott))))

;; alanforr's solution to Reverse Interleave
;; https://4clojure.com/problem/43
;; Write a function which reverses the interleave process into x number of subsequences.
;; 	
;; (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
;; 	
;; (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
;; 	
;; (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))

(fn [a n]
  (let [zindf (fn [off] (map #(+ off (* n %)) (range (/ (count a) n))))
        allinds (map zindf (range n))
        els (fn [is] (map #(nth a %) is))]
    (map els allinds)))

;; alanforr's solution to Split by Type
;; https://4clojure.com/problem/50
;; Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).
;; 	
;; (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
;; 	
;; (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
;; 	
;; (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})

(fn [c] (vals (group-by type c)))

;; alanforr's solution to Count Occurrences
;; https://4clojure.com/problem/55
;; Special Restrictions
;; frequencies
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;; 	
;; (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
;; 	
;; (= (__ [:b :a :b :a :b]) {:a 2, :b 3})
;; 	
;; (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})

(fn [s]
  (let [d (distinct s)
        f (fn [x] (filter #(= x %) s))
        counts (map count (map f d))]
    (zipmap d counts)))

;; alanforr's solution to Find Distinct Items
;; https://4clojure.com/problem/56
;; Special Restrictions
;; distinct
;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;; 	
;; (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
;; 	
;; (= (__ [:a :a :b :b :c :c]) [:a :b :c])
;; 	
;; (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
;; 	
;; (= (__ (range 50)) (range 50))

(fn [c]
  (let [rfl (fn [l] (remove #(= (first l) %) l))]
    (loop [res [] left c]
      (if (empty? left)
        res
        (recur (conj res (first left)) (rfl left))))))

;; alanforr's solution to Function Composition
;; https://4clojure.com/problem/58
;; Special Restrictions
;; comp
;; Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.
;; 	
;; (= [3 2 1] ((__ rest reverse) [1 2 3 4]))
;; 	
;; (= 5 ((__ (partial + 3) second) [1 2 3 4]))
;; 	
;; (= true ((__ zero? #(mod % 8) +) 3 5 7 9))
;; 	
;; (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))

(fn [& fns]
  (fn [& args]
    (let [[f & fns] (reverse fns)]
      (reduce #(%2 %1) (apply f args) fns))))

;; alanforr's solution to Partition a Sequence
;; https://4clojure.com/problem/54
;; Special Restrictions
;; partition
;; partition-all
;; Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned.
;; 	
;; (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
;; 	
;; (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
;; 	
;; (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))

(fn [n c]
  (letfn [(tifl [co]
            (let [t (take n co)]
              (if (< (count t) n) [] t)))]
    (loop [res [] left c]
      (if (empty? left)
        (remove empty? res)
        (recur (conj res (tifl left)) (drop n left))))))

;; alanforr's solution to Juxtaposition
;; https://4clojure.com/problem/59
;; Special Restrictions
;; juxt
;; Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
;; 	
;; (= [21 6 1] ((__ + max min) 2 3 5 1 6 4))
;; 	
;; (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello"))
;; 	
;; (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))

(fn [& fs]
  (fn [& x]
    (reduce #(conj %1 (apply %2 x)) [] fs)))

;; alanforr's solution to Word Sorting
;; https://4clojure.com/problem/70
;; Write a function that splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored.
;; 	
;; (= (__  "Have a nice day.")
;;    ["a" "day" "Have" "nice"])
;; 	
;; (= (__  "Clojure is a fun language!")
;;    ["a" "Clojure" "fun" "is" "language"])
;; 	
;; (= (__  "Fools fall for foolish follies.")
;;    ["fall" "follies" "foolish" "Fools" "for"])

(fn [e]
  (letfn [(splitonspace [a] (clojure.string/split (clojure.string/triml a) #"\s+"))
          (removepunc [b] (clojure.string/replace b #"[.!?,]" " "))
          (orderstrs [c d] (compare (clojure.string/lower-case c) (clojure.string/lower-case d)))]
    (sort orderstrs  (splitonspace (removepunc e)))))

;; alanforr's solution to Prime Numbers
;; https://4clojure.com/problem/67
;; Write a function which returns the first x number of prime numbers.
;; 	
;; (= (__ 2) [2 3])
;; 	
;; (= (__ 5) [2 3 5 7 11])
;; 	
;; (= (last (__ 100)) 541)

(fn [n]
  (letfn [(non-mults [l] (filter #(not= 0 (mod % (first l))) (rest l)) )
          (non-mult-list [l] (cons (first l) (lazy-seq (non-mult-list (non-mults l)))))]
    (take n (non-mult-list (drop 2 (range))))))

;; alanforr's solution to Filter Perfect Squares
;; https://4clojure.com/problem/74
;; Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
;; 	
;; (= (__ "4,5,6,7,8,9") "4,9")
;; 	
;; (= (__ "15,16,25,36,37") "16,25,36")

(fn [d]
  (letfn [(mysqrt [a] (int (Math/sqrt a)))
          (perfectsquare? [b] (= b (*' (mysqrt b) (mysqrt b))))
          (getintegers [c] (map #(Integer/parseInt %) (clojure.string/split c #",")))]
    (clojure.string/join "," (filter #(perfectsquare? %) (getintegers d)))))

;; alanforr's solution to Black Box Testing
;; https://4clojure.com/problem/65
;; Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.
;; Special Restrictions
;; class
;; type
;; Class
;; vector?
;; sequential?
;; list?
;; seq?
;; map?
;; set?
;; instance?
;; getClass
;; Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.
;; You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
;; 	
;; (= :map (__ {:a 1, :b 2}))
;; 	
;; (= :list (__ (range (rand-int 20))))
;; 	
;; (= :vector (__ [1 2 3 4 5 6]))
;; 	
;; (= :set (__ #{10 (rand-int 5)}))
;; 	
;; (= [:map :set :vector :list] (map __ [{} #{} [] ()]))

(fn [a]
  (let [base (empty a)]
    (cond
     (= base {}) :map
     (= base #{}) :set
     (= base '()) (if (reversible? a) :vector :list))))

;; alanforr's solution to Intro to Trampoline
;; https://4clojure.com/problem/76
;; The trampoline function takes a function f and a variable number of parameters. Trampoline calls f with any parameters that were supplied. If f returns a function, trampoline calls that function with no arguments. This is repeated, until the return value is not a function, and then trampoline returns that non-function value. This is useful for implementing mutually recursive algorithms in a way that won't consume the stack.
;; 	
;; (= __
;;    (letfn
;;      [(foo [x y] #(bar (conj x y) y))
;;       (bar [x y] (if (> (last x) 10)
;;                    x
;;                    #(foo x (+ 2 y))))]
;;      (trampoline foo [] 1)))

[1 3 5 7 9 11]

;; alanforr's solution to Perfect Numbers
;; https://4clojure.com/problem/80
;; A number is "perfect" if the sum of its divisors equal the number itself. 6 is a perfect number because 1+2+3=6. Write a function which returns true for perfect numbers and false otherwise.
;; 	
;; (= (__ 6) true)
;; 	
;; (= (__ 7) false)
;; 	
;; (= (__ 496) true)
;; 	
;; (= (__ 500) false)
;; 	
;; (= (__ 8128) true)

(fn [a] (= a (reduce + (filter #(zero? (mod a %)) (range 1 a)))))

;; alanforr's solution to Anagram Finder
;; https://4clojure.com/problem/77
;; Write a function which finds all the anagrams in a vector of words. A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y. Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other. Each sub-set should have at least two words. Words without any anagrams should not be included in the result.
;; 	
;; (= (__ ["meat" "mat" "team" "mate" "eat"])
;;    #{#{"meat" "team" "mate"}})
;; 	
;; (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
;;    #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})

(fn [d] (letfn
    [(group-into-ana-sets [a] (group-by #(set (seq %)) a))
     (select-non-lonely [b] (filter #(> (count (val %)) 1) b))
     (format-my-shit [c] (set (map #(set (nth % 1)) c)))]
    (-> d group-into-ana-sets select-non-lonely format-my-shit)))

;; alanforr's solution to Sequence Reductions
;; https://4clojure.com/problem/60
;; Special Restrictions
;; reductions
;; Write a function which behaves like reduce, but returns each intermediate value of the reduction. Your function must accept either two or three arguments, and the return sequence must be lazy.
;; 	
;; (= (take 5 (__ + (range))) [0 1 3 6 10])
;; 	
;; (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
;; 	
;; (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

(letfn [(reddy
            ([f coll]
               (lazy-seq
                (if-let [s (seq coll)]
                  (reddy f (first s) (rest s))
                  (list (f)))))
            ([f init coll]
               (cons init
                     (lazy-seq
                      (when-let [s (seq coll)]
                        (reddy f (f init (first s)) (rest s)))))))]
   (fn ([g c] (reddy g c))
     ([g i c] (reddy g i c))))

;; alanforr's solution to Merge with a Function
;; https://4clojure.com/problem/69
;; Special Restrictions
;; merge-with
;; Write a function which takes a function f and a variable number of maps. Your function should return a map that consists of the rest of the maps conj-ed onto the first. If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)
;; 	
;; (= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
;;    {:a 4, :b 6, :c 20})
;; 	
;; (= (__ - {1 10, 2 20} {1 3, 2 10, 3 15})
;;    {1 7, 2 10, 3 15})
;; 	
;; (= (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
;;    {:a [3 4 5], :b [6 7], :c [8 9]})

(fn [f & ms]
  (letfn [(map-over-map-vals [m f] (zipmap (keys m) (map f (vals m))))
          (maps-with-key [maps k] (filter #(contains? % k) maps))
          (map-vals-for-key [maps k] (vector k (map #(% k) (maps-with-key ms k))))
          (comb [& maps]
            (let [ks (distinct (mapcat keys maps))]
              (into {} (map #(map-vals-for-key maps %) ks))))]
    (map-over-map-vals (apply comb ms) #(reduce f %))))

;; alanforr's solution to intoCamelCase
;; https://4clojure.com/problem/102
;; When working with java, you often need to create an object with fieldsLikeThis, but you'd rather work with a hashmap that has :keys-like-this until it's time to convert. Write a function which takes lower-case hyphen-separated strings and converts them to camel-case strings.
;; 	
;; (= (__ "something") "something")
;; 	
;; (= (__ "multi-word-key") "multiWordKey")
;; 	
;; (= (__ "leaveMeAlone") "leaveMeAlone")

(fn [a]
  (let [spondash (clojure.string/split a #"-")
        hasdash? (> (count spondash) 1)
        wordsforcamel (fn [b] (map #(clojure.string/capitalize (nth b %)) (range 1 (count b))))]
    (if hasdash?
      (clojure.string/join (concat [(nth spondash 0)] (wordsforcamel spondash)))
      a)))

;; alanforr's solution to Euler's Totient Function
;; https://4clojure.com/problem/75
;; Two numbers are coprime if their greatest common divisor equals 1. Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x. The special case f(1) equals 1. Write a function which calculates Euler's totient function.
;; 	
;; (= (__ 1) 1)
;; 	
;; (= (__ 10) (count '(1 3 7 9)) 4)
;; 	
;; (= (__ 40) 16)
;; 	
;; (= (__ 99) 60)

(letfn [(gcd [a b]
          (loop [c a d b]
            (if (= d 0) c
                (recur d (rem c d)))))]
  (fn [c]
    (if (= c 1)
      1
      (count (filter #(= 1 (gcd c %)) (range 1 c))))))

;; alanforr's solution to Happy numbers
;; https://4clojure.com/problem/86
;; Happy numbers are positive integers that follow a particular formula: take each individual digit, square it, and then sum the squares to get a new number. Repeat with the new number and eventually, you might get to a number whose squared sum is 1. This is a happy number. An unhappy number (or sad number) is one that loops endlessly. Write a function that determines if a number is happy or not.
;; 	
;; (= (__ 7) true)
;; 	
;; (= (__ 986543210) true)
;; 	
;; (= (__ 2) false)
;; 	
;; (= (__ 3) false)

(fn [a]
  (let [digits (fn [b] (map #(Integer/parseInt (str %))  (seq (str b))))
        sumsqrdigits (fn [c] (reduce +' (map #(*' % %)  (digits c)))) ]
    (loop [curr [(sumsqrdigits a)]]
      (let [num (sumsqrdigits (last curr))]
        (cond
         (= (last curr) 1) true
         (empty? (filter #(= % num) curr)) (recur (conj curr num))
         :else false)))))

;; alanforr's solution to Reimplement Trampoline
;; https://4clojure.com/problem/78
;; Special Restrictions
;; trampoline
;; Reimplement the function described in "Intro to Trampoline".
;; 	
;; (= (letfn [(triple [x] #(sub-two (* 3 x)))
;;           (sub-two [x] #(stop?(- x 2)))
;;           (stop? [x] (if (> x 50) x #(triple x)))]
;;     (__ triple 2))
;;   82)
;; 	
;; (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
;;           (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
;;     (map (partial __ my-even?) (range 6)))
;;   [true false true false true false])
;; (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
;;           (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
;;     (map (partial __ my-even?) (range 6)))
;;   [true false true false true false])

(letfn [(funky [g]
           (let [ret (g)]
             (if (fn? ret)
               (recur ret)
               ret)))]
  (fn
    ([f] (funky f))
    ([f & args]
       (funky #(apply f args)))))

;; alanforr's solution to Power Set
;; https://4clojure.com/problem/85
;; Write a function which generates the power set of a given set. The power set of a set x is the set of all subsets of x, including the empty set and x itself.
;; 	
;; (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})
;; 	
;; (= (__ #{}) #{#{}})
;; 	
;; (= (__ #{1 2 3})
;;    #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})
;; 	
;; (= (count (__ (into #{} (range 10)))) 1024)

(fn [s]
  (loop [ps #{#{}} leftover s]
    (if (empty? leftover)
      (set ps)
      (let [thingtoadd (map #(clojure.set/union #{(first leftover)} %) ps)]
        (recur (concat ps thingtoadd) (rest leftover))))))

;; alanforr's solution to The Balance of N
;; https://4clojure.com/problem/115
;; A balanced number is one whose component digits have the same sum on the left and right halves of the number. Write a function which accepts an integer n, and returns true iff n is balanced.
;; 	
;; (= true (__ 11))
;; 	
;; (= true (__ 121))
;; 	
;; (= false (__ 123))
;; 	
;; (= true (__ 0))
;; 	
;; (= false (__ 88099))
;; 	
;; (= true (__ 89098))
;; 	
;; (= true (__ 89089))
;; 	
;; (= (take 20 (filter __ (range)))
;;    [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]) 

(fn [a]
  (letfn [(digits [b] (vec (map #(Integer/parseInt (str %))  (seq (str b)))))
          (check-balanced [c]
            (let [num (int (Math/floor (/ (count c) 2)))]
              (if (odd? (count c))
                (= (reduce +' (subvec c 0 num)) (reduce +' (subvec c (inc' num) (count c))))
                (=(reduce +' (subvec c 0 num)) (reduce +' (subvec c num (count c)))))))]
    (check-balanced (digits a))))

;; alanforr's solution to Equivalence Classes
;; https://4clojure.com/problem/98
;; A function f defined on a domain D induces an equivalence relation on D, as follows: a is equivalent to b with respect to f if and only if (f a) is equal to (f b). Write a function with arguments f and D that computes the equivalence classes of D with respect to f.
;; 	
;; (= (__ #(* % %) #{-2 -1 0 1 2})
;;    #{#{0} #{1 -1} #{2 -2}})
;; 	
;; (= (__ #(rem % 3) #{0 1 2 3 4 5 })
;;    #{#{0 3} #{1 4} #{2 5}})
;; 	
;; (= (__ identity #{0 1 2 3 4})
;;    #{#{0} #{1} #{2} #{3} #{4}})
;; 	
;; (= (__ (constantly true) #{0 1 2 3 4})
;;    #{#{0 1 2 3 4}})


(fn [f a] (set (map set (vals (group-by f a)))))

;; alanforr's solution to Identify keys and values
;; https://4clojure.com/problem/105
;; Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.
;; 	
;; (= {} (__ []))
;; 	
;; (= {:a [1]} (__ [:a 1]))
;; 	
;; (= {:a [1], :b [2]} (__ [:a 1, :b 2]))
;; 	
;; (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4]))

(fn [co]
  (letfn [(tnk [c] (take-while #(not (keyword? %)) c))
          (dnk [c]  (drop-while #(not (keyword? %)) c))
          (hashify [c]
            (into {}
                  (map
                   #(apply vector %)
                   (partition 2 c))))
          (ksep [c]
            (loop [res [(first c)] left (rest c)]
              (if (empty? left)
                (hashify (butlast res))
                (recur (conj res (tnk left) (first (dnk left)))
                       (rest (dnk left))))))]
    (ksep co)))

;; alanforr's solution to Digits and bases
;; https://4clojure.com/problem/137
;; Write a function which returns a sequence of digits of a non-negative number (first argument) in numerical system with an arbitrary base (second argument). Digits should be represented with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.
;; 	
;; (= [1 2 3 4 5 0 1] (__ 1234501 10))
;; 	
;; (= [0] (__ 0 11))
;; 	
;; (= [1 0 0 1] (__ 9 2))
;; 	
;; (= [1 0] (let [n (rand-int 100000)](__ n n)))
;; 	
;; (= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42))

(fn [n base]
    (if (zero? n)
        [0]
     (let [divvy (take-while #(<= 1 %) (iterate #(int (/ % base) ) n))
          digbackw (map #(rem % base) divvy)]
       (reverse digbackw))))

;; alanforr's solution to Sequence of pronunciations
;; https://4clojure.com/problem/110
;; Write a function that returns a lazy sequence of "pronunciations" of a sequence of numbers. A pronunciation of each element in the sequence consists of the number of repeating identical numbers and the number itself. For example, [1 1] is pronounced as [2 1] ("two ones"), which in turn is pronounced as [1 2 1 1] ("one two, one one").

;; Your function should accept an initial sequence of numbers, and return an infinite lazy sequence of pronunciations, each element being a pronunciation of the previous element.


;; 	
;; (= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1])))
;; 	
;; (= [3 1 2 4] (first (__ [1 1 1 4 4])))
;; 	
;; (= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6))
;; 	
;; (= 338 (count (nth (__ [3 2]) 15)))

(fn [a]
    (let [sortthem (fn [b] (partition-by identity b))
          nums (fn [b] (mapcat #(vec (frequencies %)) (sortthem b)))
          pron (fn [b] (mapcat reverse (nums b)))]
      (drop 1 (iterate pron a))))

;; alanforr's solution to Oscilrate
;; https://4clojure.com/problem/144
;; Write an oscillating iterate: a function that takes an initial value and a variable number of functions. It should return a lazy sequence of the functions applied to the value in order, restarting from the first function after it hits the end.
;; 	
;; (= (take 3 (__ 3.14 int double)) [3.14 3 3.0])
;; 	
;; (= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7])
;; 	
;; (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])
 



(fn [a & f]
  (let [funcs (cycle f)
        nfuncs (fn [n] (reverse (take n (cycle f))))
        appyf (fn [b n] ((apply comp (nfuncs n)) b))]
    (cons a (map #(appyf a %) (drop 1 (range))))))

;; alanforr's solution to Lazy Searching
;; https://4clojure.com/problem/108
;; Given any number of sequences, each sorted from smallest to largest, find the smallest single number which appears in all of the sequences. The sequences may be infinite, so be careful to search lazily.


;; 	
 
;; (= 3 (__ [3 4 5]))
;; 	
 
;; (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19]))
;; 	
 
;; (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13]))
;; 	
 
;; (= 64 (__ (map #(* % % %) (range)) ;; perfect cubes
;;           (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
;;           (iterate inc 20))) ;; at least as large as 20

(fn ([coll] (first coll))
  ([coll & c]
    (letfn [(all-less [a b] (last (take-while #(<= % a) b)))
            (incolls? [a c]
                      (let [li (concat [a] (map #(all-less a %)  c))]
                        (apply = li)))]
           (loop [n 0]
                 (if (incolls? (nth coll n) c)
                     (nth coll n)
                     (recur (inc n)))))))

;; alanforr's solution to Partially Flatten a Sequence
;; https://4clojure.com/problem/93
;; Write a function which flattens any nested combination of sequential things (lists, vectors, etc.), but maintains the lowest level sequential items. The result should be a sequence of sequences with only one level of nesting.
;; 	
;; (= (__ [["Do"] ["Nothing"]])
;;    [["Do"] ["Nothing"]])
;; 	
;; (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
;;    [[:a :b] [:c :d] [:e :f]])
;; 	
;; (= (__ '((1 2)((3 4)((((5 6)))))))
;;    '((1 2)(3 4)(5 6)))

(fn [a]
  (let [seqsintree (fn [b] (filter sequential? (tree-seq sequential? seq b)))]
    (filter #(not-any? coll? %) (seqsintree a))))

;; alanforr's solution to Decurry
;; https://4clojure.com/problem/158
;; Write a function that accepts a curried function of unknown arity n. Return an equivalent function of n arguments.
;; You may wish to read this.
;; https://en.wikipedia.org/wiki/Currying
;; 	
;; (= 10 ((__ (fn [a]
;;              (fn [b]
;;                (fn [c]
;;                  (fn [d]
;;                    (+ a b c d))))))
;;        1 2 3 4))
;; 	
;; (= 24 ((__ (fn [a]
;;              (fn [b]
;;                (fn [c]
;;                  (fn [d]
;;                    (* a b c d))))))
;;        1 2 3 4))
;; 	
;; (= 25 ((__ (fn [a]
;;              (fn [b]
;;                (* a b))))
;;        5 5))

(fn [f] (fn [& args] (reduce (fn [a b] (a b)) f args)))

;; alanforr's solution to Global take-while
;; https://4clojure.com/problem/114
;; take-while is great for filtering sequences, but it limited: you can only examine a single item of the sequence at a time. What if you need to keep track of some state as you go over the sequence?

;; Write a function which accepts an integer n, a predicate p, and a sequence. It should return a lazy sequence of items in the list up to, but not including, the nth item that satisfies the predicate.


;; 	
;; (= [2 3 5 7 11 13]
;;    (__ 4 #(= 2 (mod % 3))
;;          [2 3 5 7 11 13 17 19 23]))
;; 	
;; (= ["this" "is" "a" "sentence"]
;;    (__ 3 #(some #{\i} %)
;;          ["this" "is" "a" "sentence" "i" "wrote"]))
;; 	
;; (= ["this" "is"]
;;    (__ 1 #{"a"}
;;          ["this" "is" "a" "sentence" "i" "wrote"]))

(fn [n p s]
  (let [mytfs (map p s)]
    (loop [nel 0 nct 0]
      (cond
       (and (< nct n) (nth mytfs nel)) (recur (inc nel) (inc nct))
       (and (< nct n) (not (nth mytfs nel))) (recur (inc nel) nct)
       :else (take (dec nel) s)))))

;; alanforr's solution to Insert between two items
;; https://4clojure.com/problem/132
;; Write a function that takes a two-argument predicate, a value, and a collection; and returns a new collection where the value is inserted between every two items that satisfy the predicate.
;; 	
;; (= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3]))
;; 	
;; (= '(2) (__ > :more [2]))
;; 	
;; (= [0 1 :x 2 :x 3 :x 4]  (__ #(and (pos? %) (< % %2)) :x (range 5)))
;; 	
;; (empty? (__ > :more ()))
;; 	
;; (= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
;;    (take 12 (->> [0 1]
;;                  (iterate (fn [[a b]] [b (+ a b)]))
;;                  (map first) ; fibonacci numbers
;;                  (__ (fn [a b] ; both even or both odd
;;                        (= (mod a 2) (mod b 2)))
;;                      :same))))

(fn [p v s]
  (let [d1s (drop 1 s)
        things (map vector s d1s)
        fthings (concat (map #(apply p %) things) [false])
        sfs (map vector s fthings)
        ch (fn [x] (if (nth x 1) [(nth x 0) v] [(nth x 0)]))]
    (apply concat (map ch sfs))))

;; alanforr's solution to Write Roman Numerals
;; https://4clojure.com/problem/104
;; This is the inverse of Problem 92, but much easier. Given an integer smaller than 4000, return the corresponding roman numeral in uppercase, adhering to the subtractive principle.
;; 	
;; (= "I" (__ 1))
;; 	
;; (= "XXX" (__ 30))
;; 	
;; (= "IV" (__ 4))
;; 	
;; (= "CXL" (__ 140))
;; 	
;; (= "DCCCXXVII" (__ 827))
;; 	
;; (= "MMMCMXCIX" (__ 3999))
;; 	
;; (= "XLVIII" (__ 48))
;; (= "XLVIII" (__ 48))

(fn [n]
  (let [getnums (fn [h l] (int (/ (rem n h) l)) )
        numthou (int (/ n 1000))
        num5hun (getnums 1000 500)
        numhun (getnums 500 100)
        numfifty (getnums 100 50)
        numten (getnums 50 10)
        numfive (getnums 10 5)
        numone (getnums 5 1)
        rf (fn [nh nl sl sh su]
             (cond
              (and (= nl 4) (zero? nh)) (str sl sh)
              (and (= nl 4) (not (zero? nh))) (str sl su)
              :else (apply str (concat (repeat nh sh) (repeat nl sl)))))
        ones (rf numfive numone "I" "V" "X")
        tens (rf numfifty numten "X" "L" "C")
        huns (rf num5hun numhun "C" "D" "M")
        thous (apply str (repeat numthou "M"))]
    (apply str (concat thous huns tens ones)) ))

;; alanforr's solution to Generating k-combinations
;; https://4clojure.com/problem/103
;; Given a sequence S consisting of n elements generate all k-combinations of S, i. e. generate all possible sets consisting of k distinct elements taken from S. The number of k-combinations for a sequence is equal to the binomial coefficient.
;; 	
;; (= (__ 1 #{4 5 6}) #{#{4} #{5} #{6}})
;; 	
;; (= (__ 10 #{4 5 6}) #{})
;; 	
;; (= (__ 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}})
;; 	
;; (= (__ 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
;;                          #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})
;; 	
;; (= (__ 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}})
;; 	
;; (= (__ 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"}
;;                                     #{:a "abc"} #{:a "efg"} #{"abc" "efg"}})

(letfn [(seq10s [a] (into [] (seq (Integer/toString a 2))))
        (paddedseq10s [a n]
                      (let [s10 (seq10s a)
                            nex (- n (count s10))]
                        (if (zero? nex)
                          s10
                          (concat (repeat nex \0) s10))))
        (expon-int [base pow]
                   (loop [n pow, y (num 1), z base]
                     (let [t (even? n), n (quot n 2)]
                       (cond
                        t (recur n y (*' z z))
                        (zero? n) (*' z y)
                        :else (recur n (*' z y) (*' z z))))))
        (indices-needed [b] (filter #(= (nth b %) \1) (range 0 (count b))))
        (elements-needed [c d n]
                         (let [indn (indices-needed (paddedseq10s c n))]
                           (if (empty? indn)
                             #{}
                             (set (map #(nth d %) indn)))))
        (powerset [d]
          (if (empty? d)
            #{#{}}
            (let [cd (count d)
                  maxy (expon-int 2 cd)
                  vd (vec d)]
              (loop [num 0 res []]
                (if (<= num maxy)
                  (recur (inc' num) (conj res (elements-needed num vd cd)))
                  (set res))))))]
  (fn [n g] (set (filter #(= n (count %)) (powerset g)))))

;; alanforr's solution to Generating k-combinations
;; https://4clojure.com/problem/103
;; Given a sequence S consisting of n elements generate all k-combinations of S, i. e. generate all possible sets consisting of k distinct elements taken from S. The number of k-combinations for a sequence is equal to the binomial coefficient.
;; 	
;; (= (__ 1 #{4 5 6}) #{#{4} #{5} #{6}})
;; 	
;; (= (__ 10 #{4 5 6}) #{})
;; 	
;; (= (__ 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}})
;; 	
;; (= (__ 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
;;                          #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})
;; 	
;; (= (__ 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}})
;; 	
;; (= (__ 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"}
;;                                     #{:a "abc"} #{:a "efg"} #{"abc" "efg"}})

(letfn [(seq10s [a] (into [] (seq (Integer/toString a 2))))
        (paddedseq10s [a n]
                      (let [s10 (seq10s a)
                            nex (- n (count s10))]
                        (if (zero? nex)
                          s10
                          (concat (repeat nex \0) s10))))
        (expon-int [base pow]
                   (loop [n pow, y (num 1), z base]
                     (let [t (even? n), n (quot n 2)]
                       (cond
                        t (recur n y (*' z z))
                        (zero? n) (*' z y)
                        :else (recur n (*' z y) (*' z z))))))
        (indices-needed [b] (filter #(= (nth b %) \1) (range 0 (count b))))
        (elements-needed [c d n]
                         (let [indn (indices-needed (paddedseq10s c n))]
                           (if (empty? indn)
                             #{}
                             (set (map #(nth d %) indn)))))
        (powerset [d]
          (if (empty? d)
            #{#{}}
            (let [cd (count d)
                  maxy (expon-int 2 cd)
                  vd (vec d)]
              (loop [num 0 res []]
                (if (<= num maxy)
                  (recur (inc' num) (conj res (elements-needed num vd cd)))
                  (set res))))))]
  (fn [n g] (set (filter #(= n (count %)) (powerset g)))))

;; alanforr's solution to Prime Sandwich
;; https://4clojure.com/problem/116
;; A balanced prime is a prime number which is also the mean of the primes directly before and after it in the sequence of valid primes. Create a function which takes an integer n, and returns true iff it is a balanced prime.
;; 	
;; (= false (__ 4))
;; 	
;; (= true (__ 563))
;; 	
;; (= 1103 (nth (filter __ (range)) 15))


(fn [c]
  (letfn [(divisors? [a l] (some true? (map #(zero? (rem a %)) l)))
          (next-non-div [b]
            (loop [n (inc' (last b)) l b]
              (if (divisors? n b)
                (recur (inc' n) b)
                (concat b [n]))))]
    (loop [l [2] m [0]]
      (if (< (last l) c)
        (recur (next-non-div l) l)
        (and (= (last l) c) (= (last l) (/ (+' (last m) (last (next-non-div l))) 2)))))))


;; alanforr's solution to Universal Computation Engine
;; https://4clojure.com/problem/121
;; Special Restrictions
;; eval
;; resolve
;; Given a mathematical formula in prefix notation, return a function that calculates the value of the formula. The formula can contain nested calculations using the four basic mathematical operators, numeric constants, and symbols representing variables. The returned function has to accept a single parameter containing the map of variable names to their values.
;; 	
;; (= 2 ((__ '(/ a b))
;;       '{b 8 a 16}))
;; 	
;; (= 8 ((__ '(+ a b 2))
;;       '{a 2 b 4}))
;; 	
;; (= [6 0 -4]
;;      (map (__ '(* (+ 2 a)
;;                   (- 10 b)))
;;             '[{a 1 b 8}
;;               {b 5 a -2}
;;               {a 2 b 11}]))
;; 	
;; (= 1 ((__ '(/ (+ x 2)
;;               (* 3 (+ y 1))))
;;       '{x 4 y 1}))
 

(fn [formula]
  (letfn [(ev [v f]
              (cond
               (number? f) f
               (symbol? f) (v f)
               :else  (apply ({'* * '/ / '+ + '- -} (first f)) (map #(ev v %) (rest f)))))]
    (fn [x] (ev x formula))))

;; alanforr's solution to The Big Divide
;; https://4clojure.com/problem/148
;; Write a function which calculates the sum of all natural numbers under n (first argument) which are evenly divisible by at least one of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes.
;; https://en.wikipedia.org/wiki/Coprime_integers
;; Note: Some test cases have a very large n, so the most obvious solution will exceed the time limit.


;; 	
;; (= 0 (__ 3 17 11))
;; 	
;; (= 23 (__ 10 3 5))
;; 	
;; (= 233168 (__ 1000 3 5))
;; 	
;; (= "2333333316666668" (str (__ 100000000 3 5)))
;; 	
;; (= "110389610389889610389610"
;;   (str (__ (* 10000 10000 10000) 7 11)))
;; 	
;; (= "1277732511922987429116"
;;   (str (__ (* 10000 10000 10000) 757 809)))
;; 	
;; (= "4530161696788274281"
;;   (str (__ (* 10000 10000 1000) 1597 3571)))

(fn [x a b]
  (letfn [(sumfactors [y c]
            (let [u (if (zero? (rem y c))
                      (dec' (/ y c))
                      (long (/ y c)))]
              (if (zero? u) 0
                  (*' (/ (*' u (inc' u)) 2) c))))]
    (-' (+' (sumfactors x a) (sumfactors x b)) (sumfactors x (*' a b)))))

;; alanforr's solution to Intervals
;; https://4clojure.com/problem/171
;; Write a function that takes a sequence of integers and returns a sequence of "intervals". Each interval is a a vector of two integers, start and end, such that all integers between start and end (inclusive) are contained in the input sequence.
;; 	
;; (= (__ [1 2 3]) [[1 3]])
;; 	
;; (= (__ [10 9 8 1 2 3]) [[1 3] [8 10]])
;; 	
;; (= (__ [1 1 1 1 1 1 1]) [[1 1]])
;; 	
;; (= (__ []) [])
;; 	
;; (= (__ [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
;;        [[1 4] [6 6] [9 11] [13 17] [19 19]])

(fn [a]
  (if (empty? a)
    []
    (let [sa (-> a set sort)
          fl (fn [b] [(first b) (last b)])]
      (loop [res [[(first sa)]] leftover (rest sa)]
        (if (empty? leftover)
          (map fl res)
          (if (= (-> res last last inc') (first leftover))
            (recur (concat (butlast res) [(concat (last res) [(first leftover)])]) (rest leftover))
            (recur (concat res [[(first leftover)]]) (rest leftover))))))))

;; alanforr's solution to Sum Some Set Subsets
;; https://4clojure.com/problem/131
;; Given a variable number of sets of integers, create a function which returns true iff all of the sets have a non-empty subset with an equivalent summation.
;; 	
;; (= true  (__ #{-1 1 99} 
;;              #{-2 2 888}
;;              #{-3 3 7777})) ; ex. all sets have a subset which sums to zero
;; 	
;; (= false (__ #{1}
;;              #{2}
;;              #{3}
;;              #{4}))
;; 	
;; (= true  (__ #{1}))
;; 	
;; (= false (__ #{1 -3 51 9} 
;;              #{0} 
;;              #{9 2 81 33}))
;; 	
;; (= true  (__ #{1 3 5}
;;              #{9 11 4}
;;              #{-3 12 3}
;;              #{-3 4 -2 10}))
;; 	
;; (= false (__ #{-1 -2 -3 -4 -5 -6}
;;              #{1 2 3 4 5 6 7 8 9}))
;; 	
;; (= true  (__ #{1 3 5 7}
;;              #{2 4 6 8}))
;; 	
;; (= true  (__ #{-1 3 -5 7 -9 11 -13 15}
;;              #{1 -3 5 -7 9 -11 13 -15}
;;              #{1 -1 2 -2 4 -4 8 -8}))
;; 	
;; (= true  (__ #{-10 9 -8 7 -6 5 -4 3 -2 1}
;;              #{10 -9 8 -7 6 -5 4 -3 2 -1}))

(fn [& args]
  (letfn [(powerset [s]
            (loop [ps #{#{}} leftover s]
              (if-not (empty? leftover)
                (let [thingtoadd (map #(clojure.set/union #{(first leftover)} %) ps)]
                  (recur (concat ps thingtoadd) (rest leftover)))
                (set ps))))
          (pownonem [a] (remove empty? (powerset a)))
          (sumsets [b] (set (map #(reduce + %) (pownonem b))))   ]
    (not (empty? (apply clojure.set/intersection (map sumsets args))))))

;; alanforr's solution to Sequs Horribilis
;; https://4clojure.com/problem/112
;; Create a function which takes an integer and a nested collection of integers as arguments. Analyze the elements of the input collection and return a sequence which maintains the nested structure, and which includes all elements starting from the head whose sum is less than or equal to the input integer.
;; 	
;; (=  (__ 10 [1 2 [3 [4 5] 6] 7])
;;    '(1 2 (3 (4))))
;; 	
;; (=  (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11])
;;    '(1 2 (3 (4 (5 (6 (7)))))))
;; 	
;; (=  (__ 9 (range))
;;    '(0 1 2 3))
;; 	
;; (=  (__ 1 [[[[[1]]]]])
;;    '(((((1))))))
;; 	
;; (=  (__ 0 [1 2 [3 [4 5] 6] 7])
;;    '())
;; 	
;; (=  (__ 0 [0 0 [0 [0]]])
;;    '(0 0 (0 (0))))
;; 	
;; (=  (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]])
;;    '(-10 (1 (2 3 (4)))))

(fn [n a]
  (letfn [(next-thing [cnt b]
            (loop [ct cnt res [] leftover b]
              (let [head (first leftover)]
                (cond
                  (= head nil) res
                  (coll? head) (conj res (next-thing ct head))
                  (> (+ ct head) n) res
                  :else (recur (+ ct head) (conj res head) (rest leftover))))))]
    (next-thing 0 a)))

;; alanforr's solution to Tricky card games
;; https://4clojure.com/problem/141
;; In trick-taking card games such as bridge, spades, or hearts, cards are played in groups known as "tricks" - each player plays a single card, in order; the first player is said to "lead" to the trick. After all players have played, one card is said to have "won" the trick. How the winner is determined will vary by game, but generally the winner is the highest card played in the suit that was led. Sometimes (again varying by game), a particular suit will be designated "trump", meaning that its cards are more powerful than any others: if there is a trump suit, and any trumps are played, then the highest trump wins regardless of what was led.

;; Your goal is to devise a function that can determine which of a number of cards has won a trick. You should accept a trump suit, and return a function winner. Winner will be called on a sequence of cards, and should return the one which wins the trick. Cards will be represented in the format returned by Problem 128, Recognize Playing Cards: a hash-map of :suit and a numeric :rank. Cards with a larger rank are stronger.


;; 	
;; (let [notrump (__ nil)]
;;   (and (= {:suit :club :rank 9}  (notrump [{:suit :club :rank 4}
;;                                            {:suit :club :rank 9}]))
;;        (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2}
;;                                            {:suit :club :rank 10}]))))
;; 	
;; (= {:suit :club :rank 10} ((__ :club) [{:suit :spade :rank 2}
;;                                        {:suit :club :rank 10}]))
;; 	
;; (= {:suit :heart :rank 8}
;;    ((__ :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8}
;;                  {:suit :diamond :rank 10} {:suit :heart :rank 4}]))

;; (fn [trump]
;;   (let [wwithsuit (fn [suit cards]
;;                     (let [sortedcards (group-by :suit cards)
;;                           right-suit (if (nil? (sortedcards suit))
;;                                        (:suit (first cards))
;;                                        suit)
;;                           wrank (apply max (map :rank (sortedcards right-suit)))]
;;                       {:suit right-suit :rank wrank}))]
;;     (fn [cards] (wwithsuit trump cards))))

;; alanforr's solution to Balancing Brackets
;; https://4clojure.com/problem/177
;; When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up. Write a function that takes in a string and returns truthy if all square [ ] round ( ) and curly { } brackets are properly paired and legally nested, or returns falsey otherwise.
;; 	
;; (__ "This string has no brackets.")
;; 	
;; (__ "class Test {
;;       public static void main(String[] args) {
;;         System.out.println(\"Hello world.\");
;;       }
;;     }")
;; 	
;; (not (__ "(start, end]"))
;; 	
;; (not (__ "())"))
;; 	
;; (not (__ "[ { ] } "))
;; 	
;; (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
;; 	
;; (not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
;; 	
;; (not (__ "["))

(fn [a]
  (let [brvec [\( \) \[ \] \{ \}]
        bracket? (fn [b] (seq (filter #(= b %) brvec)))
        only-brackets (filter bracket? a)
        cob (count only-brackets)
        match? (fn [c1 c2] (or
                           (and (= c1 \() (= c2 \)))
                           (and (= c1 \[) (= c2 \]))
                           (and (= c1 \{) (= c2 \}))))
        remove-matches (fn [ob]
                         (loop [ind 0 res []]
                           (cond
                            (= ind (dec' (count ob))) (concat res [(last ob)])
                            (> ind (dec' (count ob))) res
                            (not (match? (nth ob ind) (nth ob (inc' ind)))) (recur (inc' ind) (concat res [(nth ob ind)]))
                            (match? (nth ob ind) (nth ob (inc' ind))) (recur (+' ind 2) res))))]
    (if (odd? cob)
      false
      (loop [leftover only-brackets]
        (cond
         (empty? leftover) true
         (= leftover (remove-matches leftover)) false
         :else (recur (remove-matches leftover)))))))

(defn match-next? [ob]
  (map #(match? %1 %2) ob (rest ob)))

(defn ins? [a s] (seq (filter #(= a %) s)))

(defn remove-matches [ob]
  (let [mn (match-next? ob)
        cmn (count mn)
        tis (filter #(nth mn %) (range (dec' cmn)))
        ris  (mapcat #(vector % (inc' %)) tis)
        kis (remove #(ins? % ris) (range cmn))]
   (map #(nth ob %) kis)))

;; alanforr's solution to Palindromic Numbers
;; https://4clojure.com/problem/150
;; A palindromic number is a number that is the same when written forwards or backwards (e.g., 3, 99, 14341).

;; Write a function which takes an integer n, as its only argument, and returns an increasing lazy sequence of all palindromic numbers that are not less than n.

;; The most simple solution will exceed the time limit!


;; 	
;; (= (take 26 (__ 0))
;;    [0 1 2 3 4 5 6 7 8 9 
;;     11 22 33 44 55 66 77 88 99 
;;     101 111 121 131 141 151 161])
;; 	
;; (= (take 16 (__ 162))
;;    [171 181 191 202 
;;     212 222 232 242 
;;     252 262 272 282 
;;     292 303 313 323])
;; 	
;; (= (take 6 (__ 1234550000))
;;    [1234554321 1234664321 1234774321 
;;     1234884321 1234994321 1235005321])
;; 	
;; (= (first (__ (* 111111111 111111111)))
;;    (* 111111111 111111111))
;; 	
;; (= (set (take 199 (__ 0)))
;;    (set (map #(first (__ %)) (range 0 10000))))
;; 	
;; (= true 
;;    (apply < (take 6666 (__ 9999999))))
;; 	
;; (= (nth (__ 0) 10101)
;;    9102019)

(fn [n]
  (letfn [(decode [n] (if (< n 10) [n] (conj (decode (quot n 10)) (rem n 10))))
          (encode [x] (reduce #(+ (* % 10) %2) 0 x))
          (next-pal [n]
            (let [N (decode n)
                  l (count N)
                  d (quot l 2)
                  H (take d N)
                  H1 (decode (inc (encode H)))
                  Hr (reverse H)
                  h (encode Hr)
                  p (nth N d)
                  t (encode (take-last d N))]
              (encode (cond
                (and (even? l) (>= h t)) (concat H Hr)
                (and (odd? l) (>= h t)) (concat H [p] Hr)
                (even? l) (concat H1 (reverse H1))
                (and (odd? l) (< p 9)) (concat H [(inc p)] Hr)
                :else (concat H1 [0] (reverse H1))))))]
    (iterate (comp next-pal inc) (next-pal n))))

;; alanforr's solution to Infinite Matrix
;; https://4clojure.com/problem/168
;; In what follows, m, n, s, t denote nonnegative integers, f denotes a function that accepts two arguments and is defined for all nonnegative integers in both arguments.

;; In mathematics, the function f can be interpreted as an infinite matrix with infinitely many rows and columns that, when written, looks like an ordinary matrix but its rows and columns cannot be written down completely, so are terminated with ellipses. In Clojure, such infinite matrix can be represented as an infinite lazy sequence of infinite lazy sequences, where the inner sequences represent rows.

;; Write a function that accepts 1, 3 and 5 arguments

;; with the argument f, it returns the infinite matrix A that has the entry in the i-th row and the j-th column equal to f(i,j) for i,j = 0,1,2,...;
;; with the arguments f, m, n, it returns the infinite matrix B that equals the remainder of the matrix A after the removal of the first m rows and the first n columns;
;; with the arguments f, m, n, s, t, it returns the finite s-by-t matrix that consists of the first t entries of each of the first s rows of the matrix B or, equivalently, that consists of the first s entries of each of the first t columns of the matrix B.

;; 	
;; (= (take 5 (map #(take 6 %) (__ str)))
;;    [["00" "01" "02" "03" "04" "05"]
;;     ["10" "11" "12" "13" "14" "15"]
;;     ["20" "21" "22" "23" "24" "25"]
;;     ["30" "31" "32" "33" "34" "35"]
;;     ["40" "41" "42" "43" "44" "45"]])
;; 	
;; (= (take 6 (map #(take 5 %) (__ str 3 2)))
;;    [["32" "33" "34" "35" "36"]
;;     ["42" "43" "44" "45" "46"]
;;     ["52" "53" "54" "55" "56"]
;;     ["62" "63" "64" "65" "66"]
;;     ["72" "73" "74" "75" "76"]
;;     ["82" "83" "84" "85" "86"]])
;; 	
;; (= (__ * 3 5 5 7)
;;    [[15 18 21 24 27 30 33]
;;     [20 24 28 32 36 40 44]
;;     [25 30 35 40 45 50 55]
;;     [30 36 42 48 54 60 66]
;;     [35 42 49 56 63 70 77]])
;; 	
;; (= (__ #(/ % (inc %2)) 1 0 6 4)
;;    [[1/1 1/2 1/3 1/4]
;;     [2/1 2/2 2/3 1/2]
;;     [3/1 3/2 3/3 3/4]
;;     [4/1 4/2 4/3 4/4]
;;     [5/1 5/2 5/3 5/4]
;;     [6/1 6/2 6/3 6/4]])
;; Special Restrictions
;; for
;; range
;; iterate
;; repeat
;; cycle
;; drop

(letfn [(ints-from [n] (cons n (lazy-seq (ints-from (inc' n)))))
        (cell [i1 i2] [i1 i2])
        (row [r start] (map #(cell r %) (ints-from start)))
        (rows [m n] (map #(row % n) (ints-from m)))
        (finite-set-rows [m n s t] (take s (map #(take t %) (rows m n))))
        (f-to-r [f r] (map #(apply f %) r))
        (f-to-m [f m] (map #(f-to-r f %) m))]
  (fn ([f] (f-to-m f (rows 0 0)))
     ([f m n] (f-to-m f (rows m n)))
     ([f m n s t] (f-to-m f (finite-set-rows m n s t)))))

;; alanforr's solution to Longest Increasing Sub-Seq
;; https://4clojure.com/problem/53
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;; 	
;; (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
;; 	
;; (= (__ [5 6 1 3 2 7]) [5 6])
;; 	
;; (= (__ [2 3 3 4 5]) [3 4 5])
;; 	
;; (= (__ [7 6 5 4]) [])

(fn [a]
  (letfn [(next-inc? [n c] (= (inc' (nth c n)) (nth c (inc' n))))
          (previous-inc? [n c] (= (dec' (nth c n)) (nth c (dec' n))))
          (next-previous-incs? [n c] (and (next-inc? n c) (previous-inc? n c)))
          (npi [n c] [(previous-inc? n c) (next-inc? n c)])
          (nistart? [c] (if (next-inc? 0 c) [false true] [false false]))
          (niend? [c] (if (previous-inc? (dec' (count c)) c) [true false] [false false]))
          (incs? [c]
            (let [cc (count c)
                  mid-incs (map #(npi % c) (range 1 (dec' cc)))
                  all-incs  (concat [(nistart? c)] mid-incs [(niend? c)])
                  add-to-last (fn [n col] (concat (butlast col) [(concat (last col) [(nth c n)])]))]
              (loop [res [[]] num 0]
                (cond
                 (> num (dec' cc)) (last (sort-by count res))
                 (= (nth all-incs num) [false false]) (recur res (inc' num))
                 (or (= (nth all-incs num) [true false]) (= (nth all-incs num) [true true])) (recur (add-to-last num res) (inc' num))
                 (= (nth all-incs num) [false true]) (recur (concat res [[(nth c num)]]) (inc' num))))))]
    (incs? a)))

;; alanforr's solution to Analyze a Tic-Tac-Toe Board
;; https://4clojure.com/problem/73
;; A tic-tac-toe board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e. A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row. Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.
;; 	
;; (= nil (__ [[:e :e :e]
;;             [:e :e :e]
;;             [:e :e :e]]))
;; 	
;; (= :x (__ [[:x :e :o]
;;            [:x :e :e]
;;            [:x :e :o]]))
;; 	
;; (= :o (__ [[:e :x :e]
;;            [:o :o :o]
;;            [:x :e :x]]))
;; 	
;; (= nil (__ [[:x :e :o]
;;             [:x :x :e]
;;             [:o :x :o]]))
;; 	
;; (= :x (__ [[:x :e :e]
;;            [:o :x :e]
;;            [:o :e :x]]))
;; 	
;; (= :o (__ [[:x :e :o]
;;            [:x :o :e]
;;            [:o :e :x]]))
;; 	
;; (= nil (__ [[:x :o :x]
;;             [:x :o :x]
;;             [:o :x :o]]))

(fn [board]
  (letfn [(columns [b] (apply map vector b))
          (lrdiag [b] (map #(nth (nth b %) %) (-> b count range)))
          (rldiag [b] (map #(nth (nth b %) (-' (count b) % 1)) (-> b count range)))
          (winner-slice [r]
            (cond
             (not (every? #(= (first r) %) r)) nil
             (= (first r) :e) nil
             :else (first r)))
          (all-slices [b] (concat b (columns b) [(lrdiag b)] [(rldiag b)]))
          (winner [b] (first (remove nil? (map winner-slice (all-slices b)))))]
    (winner board)))

;; alanforr's solution to Read Roman numerals
;; https://4clojure.com/problem/92
;; Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents.

;; You can assume that the input will be well-formed, in upper-case, and follow the subtractive principle. You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.
;; 	
;; (= 14 (__ "XIV"))
;; 	
;; (= 827 (__ "DCCCXXVII"))
;; 	
;; (= 3999 (__ "MMMCMXCIX"))
;; 	
;; (= 48 (__ "XLVIII"))

(fn [n]
  (letfn [(thousands [num] (* 1000 (count (take-while #(= \M %) num))))
          (without-thousands [num] (drop-while #(= \M %) num))
          (five-hundreds [num] (if (= \D (first (without-thousands num))) 500 0))
          (without-500s [num] (drop-while #(= \D %) (without-thousands num)))
          (hundreds [num]
            (let [numw (without-500s num)]
              (cond
               (and (= \C (first numw)) (= \D (nth numw 1))) 400
               (and (= \C (first numw)) (= \M (nth numw 1))) 900
               :else (* 100 (count (take-while #(= \C %) numw))))))
          (without-hundreds [num]
            (drop-while #(or (= \C %) (= \D %) (= \M %)) (without-500s num)))
          (fifties [num] (if (= \L (first (without-hundreds num))) 50 0))
          (without-50s [num] (drop-while #(= \L %) (without-hundreds num)))
          (tens [num]
            (let [numw (without-50s num)]
              (cond
               (and (= \X (first numw)) (= \L (nth numw 1))) 40
               (and (= \X (first numw)) (= \C (nth numw 1))) 90
               :else (* 10 (count (take-while #(= \X %) numw))))))
          (without-tens [num] (drop-while #(or (= \X %) (= \L %) (= \C %)) (without-50s num)))
          (fives [num] (if (= \V (first (without-tens num))) 5 0))
          (without-fives [num] (drop-while #(= \V %) (without-tens num)))
          (ones [num]
            (let [numw (without-fives num)]
              (cond
               (and (= \I (first numw)) (= \V (nth numw 1))) 4
               (and (= \I (first numw)) (= \X (nth numw 1))) 9
               :else (* (count (take-while #(= \I %) numw))))))
          (roman-conv [num] (+' (thousands num) (five-hundreds num) (hundreds num) (tens num) (fives num) (ones num)))]
    (roman-conv n)))

;; alanforr's solution to Triangle Minimal Path
;; https://4clojure.com/problem/79
;; Write a function which calculates the sum of the minimal path through a triangle. The triangle is represented as a collection of vectors. The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.
;; 	
;; (= 7 (__ '([1]
;;           [2 4]
;;          [5 1 4]
;;         [2 3 4 5]))) ; 1->2->1->3
;; 	
;; (= 20 (__ '([3]
;;            [2 4]
;;           [1 9 3]
;;          [9 9 2 4]
;;         [4 6 6 7 8]
;;        [5 7 3 5 1 4]))) ; 3->4->3->2->7->1
;; (= 20 (__ '([3]
;;            [2 4]
;;           [1 9 3]
;;          [9 9 2 4]
;;         [4 6 6 7 8]
;;        [5 7 3 5 1 4]))) ; 3->4->3->2->7->1

(fn [tri]
  (letfn [(minfrom [triangle ind]
            (if (empty? triangle) 0
                (min
                 (+' (nth (first triangle) ind) (minfrom (rest triangle) ind))
                 (+' (nth (first triangle) ind) (minfrom (rest triangle) (inc' ind))))))]
    (minfrom tri 0)))

;; alanforr's solution to Transitive Closure
;; https://4clojure.com/problem/84
;; Write a function which generates the transitive closure of a binary relation. The relation will be represented as a set of 2 item vectors.
;; https://en.wikipedia.org/wiki/Transitive_closure
;; https://en.wikipedia.org/wiki/Binary_relation
;; 	
;; (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
;;   (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))
;; 	
;; (let [more-legs
;;       #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
;;   (= (__ more-legs)
;;      #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
;;        ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}))
;; 	
;; (let [progeny
;;       #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
;;   (= (__ progeny)
;;      #{["father" "son"] ["father" "grandson"]
;;        ["uncle" "cousin"] ["son" "grandson"]}))

(fn [r]
  (letfn [(related? [brel1 brel2] (= (last brel1) (first brel2)))
          (add-rel [brel]
            (let [addthing (for [r1 brel
                                 r2 brel
                                 :when (related? r1 r2)]
                             [(first r1) (last r2)])]
              (set (concat brel addthing))))
          (add-all-rels [brel]
            (if (= (add-rel brel) brel)
              brel
              (recur (add-rel brel))))]
    (add-all-rels r)))

;; alanforr's solution to Word Chains
;; https://4clojure.com/problem/82
;; A word chain consists of a set of words ordered so that each word differs by only one letter from the words directly before and after it. The one letter difference can be either an insertion, a deletion, or a substitution. Here is an example word chain:

;; cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog

;; Write a function which takes a sequence of words, and returns true if they can be arranged into one continous word chain, and false if they cannot.
;; 	
;; (= true (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}))
;; 	
;; (= false (__ #{"cot" "hot" "bat" "fat"}))
;; 	
;; (= false (__ #{"to" "top" "stop" "tops" "toss"}))
;; 	
;; (= true (__ #{"spout" "do" "pot" "pout" "spot" "dot"}))
;; 	
;; (= true (__ #{"share" "hares" "shares" "hare" "are"}))
;; 	
;; (= false (__ #{"share" "hares" "hare" "are"}))

(fn [words]
  (letfn [(one-diff? [w1 w2]
            (let [fronts (fn [w] (map #(take % w) (range 1 (inc' (count w)))))
                  backs (fn [w] (map #(drop % w) (range (count w))))
                  fw1 (fronts w1)
                  fw2 (fronts w2)
                  bw1 (backs w1)
                  bw2 (backs w2)
                  froverlap (clojure.set/intersection (set fw1) (set fw2))
                  boverlap (clojure.set/intersection (set bw1) (set bw2))
                  largestfover (last (sort-by count froverlap))
                  largestbover (last (sort-by count boverlap))
                  candidate (apply str (concat largestfover largestbover))
                  dl (- (count w1) (count w2))
                  lengths? (and (> dl -2) (< dl 2))
                  ldbyone (= 1 (- (count w1) (count candidate)))
                  samelength (= (count w1) (count w2))]
              (cond
               (not lengths?) false
               (or (= candidate w1) (= candidate w2)) true
               (and ldbyone samelength) true
               :else false)))
          (all-splits [s] (map #(split-at % s) (range (inc (count s)))))
          (put-in-each-slot [a s] (map #(concat (first %) [a] (last %)) (all-splits s)))
          (next-perm [a ps] (mapcat #(put-in-each-slot a %) ps))
          (perms [s]
            (loop [inthing (first s) res [[]] left (rest s)]
              (if (empty? left)
                (next-perm inthing res)
                (recur (first left) (next-perm inthing res) (rest left)))))
          (chain? [ws]
            (let [oned? (map #(one-diff? (nth ws %) (nth ws (inc %))) (-> ws count dec range))]
              (every? identity oned?)))]
    (-> (filter chain? (perms words)) empty? not)))

;; alanforr's solution to Graph Connectivity
;; https://4clojure.com/problem/91
;; Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.

;; -Your function must return true if the graph is connected and false otherwise.

;; -You will be given a set of tuples representing the edges of a graph. Each member of a tuple being a vertex/node in the graph.

;; -Each edge is undirected (can be traversed either direction).
;; 	
;; (= true (__ #{[:a :a]}))
;; 	
;; (= true (__ #{[:a :b]}))
;; 	
;; (= false (__ #{[1 2] [2 3] [3 1]
;;                [4 5] [5 6] [6 4]}))
;; 	
;; (= true (__ #{[1 2] [2 3] [3 1]
;;               [4 5] [5 6] [6 4] [3 4]}))
;; 	
;; (= false (__ #{[:a :b] [:b :c] [:c :d]
;;                [:x :y] [:d :a] [:b :e]}))
;; 	
;; (= true (__ #{[:a :b] [:b :c] [:c :d]
;;               [:x :y] [:d :a] [:b :e] [:x :a]}))

(fn [gr]
  (letfn [(share? [c1 c2] (some #(or (= (first c2) %) (= (last c2) %)) c1))
          (sharers [c1 cs2] (filter #(share? c1 %) cs2))
          (non-sharers [c1 cs2] (remove #(share? c1 %) cs2))
          (add-sharers [c1 cs2] (set (concat c1 (apply concat (sharers c1 cs2)))))
          (connected? [g]
            (loop [res (first g) leftover (rest g)]
              (if (empty? leftover)
                true
                (if (and (= (add-sharers res leftover) res) (empty? (sharers res leftover)))
                  false
                  (recur (add-sharers res leftover) (non-sharers res leftover))))))]
    (connected? gr)))

;; alanforr's solution to Game of Life
;; https://4clojure.com/problem/94
;; The game of life is a cellular automaton devised by mathematician John Conway.

;; The 'board' consists of both live (#) and dead ( ) cells. Each cell interacts with its eight neighbours (horizontal, vertical, diagonal), and its next state is dependent on the following rules:

;; 1) Any live cell with fewer than two live neighbours dies, as if caused by under-population.
;; 2) Any live cell with two or three live neighbours lives on to the next generation.
;; 3) Any live cell with more than three live neighbours dies, as if by overcrowding.
;; 4) Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

;; Write a function that accepts a board, and returns a board representing the next generation of cells.
;; 	
;; (= (__ ["      "  
;;         " ##   "
;;         " ##   "
;;         "   ## "
;;         "   ## "
;;         "      "])
;;    ["      "  
;;     " ##   "
;;     " #    "
;;     "    # "
;;     "   ## "
;;     "      "])
;; 	
;; (= (__ ["     "
;;         "     "
;;         " ### "
;;         "     "
;;         "     "])
;;    ["     "
;;     "  #  "
;;     "  #  "
;;     "  #  "
;;     "     "])
;; 	
;; (= (__ ["      "
;;         "      "
;;         "  ### "
;;         " ###  "
;;         "      "
;;         "      "])
;;    ["      "
;;     "   #  "
;;     " #  # "
;;     " #  # "
;;     "  #   "
;;     "      "])

(fn [board]
  (letfn [(cells-with-s [b s]
            (let [lcinrow (fn [rn] (filter #(= s (nth (nth b rn) %)) (range (count (nth b rn)))))
                  rowsl (map #(vector % (lcinrow %)) (range (count b)))
                  cellslr (fn [rl] (if (empty? (last  rl)) nil
                                      (map #(vector (first rl) %) (last rl))))]
              (apply concat (map cellslr rowsl))))
          (live-cells [b] (cells-with-s b \#))
          (dead-cells [b] (cells-with-s b \space))
          (my-abs [n] (if (neg? n) (-' n) n))
          (in-nbd [n1 n2 dist] (<= (my-abs (-' n1 n2)) dist))
          (neighbours? [cell1 cell2]
            (cond
             (= cell1 cell2) false
             (and (in-nbd (first cell1) (first cell2) 1) (in-nbd (last cell1) (last cell2) 1)) true
             :else false))
          (count-live-neighbours [c lcs] (count (filter #(neighbours? c %) lcs)))
          (live-cell-rules [c lcs]
            (let [cln (count-live-neighbours c lcs)]
              (cond (< cln 2) false
                    (or (= cln 2) (= cln 3)) true
                    :else false)))
          (dead-cell-rules [c lcs]
            (let [cln (count-live-neighbours c lcs)]
              (cond (= cln 3) true
                    :else false)))
          (new-live-cells [b]
            (let [lcs (live-cells b)
                  dcs (dead-cells b)
                  lcslive (filter #(live-cell-rules % lcs) lcs)
                  dcslive (filter #(dead-cell-rules % lcs) dcs)
                  newlcs (concat lcslive dcslive)]
              newlcs))
          (newboard [b]
            (let [nlb (new-live-cells b)
                  strels (for [x (range (count b))
                               y (range (count (first b)))]
                           (if (empty? (filter #(= [x y] %) nlb))
                             " "
                             "#"))
                  strb (partition (count (first b)) strels)]
              (map #(apply str %) strb)))]
    (newboard board)))

;; alanforr's solution to Number Maze
;; https://4clojure.com/problem/106
;; Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:
;; double
;; halve (odd numbers cannot be halved)
;; add 2
;; Find the shortest path through the "maze". Because there are multiple shortest paths, you must return the length of the shortest path, not the path itself.
;; 	
;; (= 1 (__ 1 1))  ; 1
;; 	
;; (= 3 (__ 3 12)) ; 3 6 12
;; 	
;; (= 3 (__ 12 3)) ; 12 6 3
;; 	
;; (= 3 (__ 5 9))  ; 5 7 9
;; 	
;; (= 9 (__ 9 2))  ; 9 18 20 10 12 6 8 4 2
;; 	
;; (= 5 (__ 9 12)) ; 9 11 22 24 12
 

(fn [init targ]
  (letfn [(half [n] (/ n 2))
          (times-two [n] (*' 2 n))
          (add-two [n] (+' n 2))
          (operations [n]
            (if (zero? (mod n 2))
              (map #(% n) [half times-two add-two])
              (map #(% n) [times-two add-two])))]
    (loop [n 1 res [init]]
      (if (some #(= targ %) res)
        n
        (recur (inc n) (mapcat operations res))))))

;; alanforr's solution to Levenshtein Distance
;; https://4clojure.com/problem/101
;; Given two sequences x and y, calculate the Levenshtein distance of x and y, i. e. the minimum number of edits needed to transform x into y. The allowed edits are:

;; - insert a single item
;; - delete a single item
;; - replace a single item with another item

;; WARNING: Some of the test cases may timeout if you write an inefficient solution!
;; 	
;; (= (__ "kitten" "sitting") 3)
;; 	
;; (= (__ "closure" "clojure") (__ "clojure" "closure") 1)
;; 	
;; (= (__ "xyx" "xyyyx") 2)
;; 	
;; (= (__ "" "123456") 6)
;; 	
;; (= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0)
;; 	
;; (= (__ [1 2 3 4] [0 2 3 4 5]) 2)
;; 	
;; (= (__ '(:a :b :c :d) '(:a :d)) 2)
;; 	
;; (= (__ "ttttattttctg" "tcaaccctaccat") 10)
;; 	
;; (= (__ "gaattctaatctc" "caaacaaaaaattt") 9)

(fn [w1 w2]
  (if (or (zero? (count w1)) (zero? (count w2)))
    (+' (count w1) (count w2))
    (let [fr (range (inc' (count w1)))
          upper1 (count w1)
          upper2 (inc' (count w2))
          diff (fn [wr1 wr2 ln1 ln2] (if (= (nth wr1 ln1) (nth wr2 ln2)) 0 1))
          edd (fn [wr1 wr2 ln1 ln2 prevr currr] (min (inc' (nth prevr ln1))
                                                    (inc' (last currr))
                                                    (+' (nth prevr (dec' ln1)) (diff wr1 wr2 ln1 ln2))))
          pw1 (concat [[]] w1)
          pw2 (concat [[]] w2)]
      (loop [n1 1 n2 1 pr fr cr [1]]
        (cond
         (= n2 upper2) (last pr)
         (< n1 upper1) (recur (inc' n1) n2 pr (concat cr [(edd pw1 pw2 n1 n2 pr cr)]))
         (= n1 upper1) (recur 1 (inc' n2) (concat cr [(edd pw1 pw2 n1 n2 pr cr)]) [(inc' n2)]))))))

;; alanforr's solution to Graph Tour
;; https://4clojure.com/problem/89
;; Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in which every edge is visited exactly once.

;; The graph is represented by a vector of tuples, where each tuple represents a single edge.

;; The rules are:

;; - You can start at any node.
;; - You must visit each edge exactly once.
;; - All edges are undirected.
;; 	
;; (= true (__ [[:a :b]]))
;; 	
;; (= false (__ [[:a :a] [:b :b]]))
;; 	
;; (= false (__ [[:a :b] [:a :b] [:a :c] [:c :a]
;;                [:a :d] [:b :d] [:c :d]]))
;; 	
;; (= true (__ [[1 2] [2 3] [3 4] [4 1]]))
;; 	
;; (= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
;;               [:b :e] [:a :d] [:b :d] [:c :e]
;;               [:d :e] [:c :f] [:d :f]]))
;; 	
;; (= false (__ [[1 2] [2 3] [2 4] [2 5]]))
;; (= false (__ [[1 2] [2 3] [2 4] [2 5]]))

(fn [gr]
  (letfn [(share? [c1 c2] (some #(or (= (first c2) %) (= (last c2) %)) c1))
          (sharers [c1 cs2] (filter #(share? c1 %) cs2))
          (non-sharers [c1 cs2] (remove #(share? c1 %) cs2))
          (add-sharers [c1 cs2] (set (concat c1 (apply concat (sharers c1 cs2)))))
          (offset [o c] (take (count c) (drop o (cycle c))))
          (all-offsets [c] (map #(offset % c) (range (count c))))
          (all-share-counts [c] (map #(count (sharers (first %) (rest %))) (all-offsets c)))
          (number-odds [c] (count (filter odd? (all-share-counts c))))
          (connected? [g]
            (loop [res (first g) leftover (rest g)]
              (if (empty? leftover)
                true
                (if (and (= (add-sharers res leftover) res) (empty? (sharers res leftover)))
                  false
                  (recur (add-sharers res leftover) (non-sharers res leftover))))))]
    (and (connected? gr) (<= (number-odds gr) 2))))

;; alanforr's solution to Win at Tic-Tac-Toe
;; https://4clojure.com/problem/119
;; As in Problem 73, a tic-tac-toe board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e. Create a function that accepts a game piece and board as arguments, and returns a set (possibly empty) of all valid board placements of the game piece which would result in an immediate win.

;; Board coordinates should be as in calls to get-in. For example, [0 1] is the topmost row, center position.


;; 	
;; (= (__ :x [[:o :e :e] 
;;            [:o :x :o] 
;;            [:x :x :e]])
;;    #{[2 2] [0 1] [0 2]})
;; 	
;; (= (__ :x [[:x :o :o] 
;;            [:x :x :e] 
;;            [:e :o :e]])
;;    #{[2 2] [1 2] [2 0]})
;; 	
;; (= (__ :x [[:x :e :x] 
;;            [:o :x :o] 
;;            [:e :o :e]])
;;    #{[2 2] [0 1] [2 0]})
;; 	
;; (= (__ :x [[:x :x :o] 
;;            [:e :e :e] 
;;            [:e :e :e]])
;;    #{})
;; 	
;; (= (__ :o [[:x :x :o] 
;;            [:o :e :o] 
;;            [:x :e :e]])
;;    #{[2 2] [1 1]})

(fn [sub board]
  (letfn [(columns [b] (apply map vector b))
          (lrdiag [b] (map #(nth (nth b %) %) (-> b count range)))
          (rldiag [b] (map #(nth (nth b %) (-' (count b) % 1)) (-> b count range)))
          (winner-slice [r]
            (cond
             (not (every? #(= (first r) %) r)) nil
             (= (first r) :e) nil
             :else (first r)))
          (all-slices [b] (concat b (columns b) [(lrdiag b)] [(rldiag b)]))
          (winner [b] (first (remove nil? (map winner-slice (all-slices b)))))
          (find-empties [b]
            (let [esinr (fn [r] (filter #(= :e (nth r %)) (range (count r))))
                  esinrs (map-indexed #(vector %1 (esinr %2)) b)
                  coords (fn [er] (if (empty? (last er))
                                   nil
                                   (map #(vector (first er) %) (last er))))]
              (mapcat coords esinrs)))
          (replace-empties [r b]
            (let [es (find-empties b)
                  rep (fn [e ri]
                        (if (= ri (first e))
                          (assoc (nth b ri) (last e) r)
                          (nth b ri)))
                  repb (fn [e] (map #(rep e %) (range (count b))))]
              (map #(vector % (repb %)) es)))
          (wins [r b]
            (let [res (replace-empties r b)
                  win? (fn [el] (if (= r (winner (last el))) (first el) nil))]
              (set (remove nil? (map win? res)))))]
    (wins sub board)))

;; alanforr's solution to Making Data Dance
;; https://4clojure.com/problem/113
;; Write a function that takes a variable number of integer arguments. If the output is coerced into a string, it should return a comma (and space) separated list of the inputs sorted smallest to largest. If the output is coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.
;; 	
;; (= "1, 2, 3" (str (__ 2 1 3)))
;; 	
;; (= '(2 1 3) (seq (__ 2 1 3)))
;; 	
;; (= '(2 1 3) (seq (__ 2 1 3 3 1 2)))
;; 	
;; (= '(1) (seq (apply __ (repeat 5 1))))
;; 	
;; (= "1, 1, 1, 1, 1" (str (apply __ (repeat 5 1))))
;; 	
;; (and (= nil (seq (__)))
;;      (=  "" (str (__))))
;; (and (= nil (seq (__)))
;;      (=  "" (str (__))))

(fn [& nums]
  (reify
    java.lang.Object
    (toString [thingy] (clojure.string/join ", " (sort nums)))
    clojure.lang.Seqable
    (seq [thingy] (and nums (distinct nums)))))

;; alanforr's solution to For Science!
;; https://4clojure.com/problem/117
;; the mazes in which it's possible for the mouse to reach the cheesy endpoint. Write a function which accepts a maze in the form of a collection of rows, each row is a string where:
;; spaces represent areas where the mouse can walk freely
;; hashes (#) represent walls where the mouse can not walk
;; M represents the mouse's starting point
;; C represents the cheese which the mouse must reach
;; The mouse is not allowed to travel diagonally in the maze (only up/down/left/right), nor can he escape the edge of the maze. Your function must return true iff the maze is solvable by the mouse.
;; 	
;; (= true  (__ ["M   C"]))
;; 	
;; (= false (__ ["M # C"]))
;; 	
;; (= true  (__ ["#######"
;;               "#     #"
;;               "#  #  #"
;;               "#M # C#"
;;               "#######"]))
;; 	
;; (= false (__ ["########"
;;               "#M  #  #"
;;               "#   #  #"
;;               "# # #  #"
;;               "#   #  #"
;;               "#  #   #"
;;               "#  # # #"
;;               "#  #   #"
;;               "#  #  C#"
;;               "########"]))
;; 	
;; (= false (__ ["M     "
;;               "      "
;;               "      "
;;               "      "
;;               "    ##"
;;               "    #C"]))
;; 	
;; (= true  (__ ["C######"
;;               " #     "
;;               " #   # "
;;               " #   #M"
;;               "     # "]))
;; 	
;; (= true  (__ ["C# # # #"
;;               "        "
;;               "# # # # "
;;               "        "
;;               " # # # #"
;;               "        "
;;               "# # # #M"]))

(fn [maze]
  (letfn [(find-el [m el]
            (let [rowind (first (filter #(some (fn [x] (= x el)) (nth m %)) (range (count m))))
                  colind (first (filter #(= el (nth (nth m rowind) %)) (range (count (first m)))))]
              [rowind colind]))
          (find-els [m el]
            (let [rowinds (filter #(some (fn [x] (= x el)) (nth m %)) (range (count m)))
                  colindf (fn [r] (filter #(= el (nth (nth m r) %)) (range (count (first m)))))
                  rcf (fn [r] (map #(vector r %) (colindf r)))]
              (mapcat rcf rowinds)))
          (adjacent? [s1 s2]
            (let [samex? (= (first s1) (first s2))
                  samey? (= (last s1) (last s2))

                  diffx (-' (first s1) (first s2))
                  x1diff? (or (= 1 diffx) (= -1 diffx))
                  diffy (-' (last s1) (last s2))
                  y1diff? (or (= 1 diffy) (= -1 diffy))
                  notdiag? (not (and x1diff? y1diff?))
                  one-diff? (or (and x1diff? samey?) (and y1diff? samex?))]
              (and notdiag? one-diff?)))
          (alladjf [el los] (filter #(adjacent? el %) los))
          (remadjf [el los] (remove #(adjacent? el %) los))
          (maze-solution? [m]
            (let [startm (find-el m \M)
                  endm (find-el m \C)
                  sps (find-els m \space)]
              (loop [ends (set (alladjf startm sps)) left (set (remadjf startm sps))]
                (let [newend (set (mapcat #(alladjf % left) ends))]
                  (cond
                   (some #(adjacent? endm %) ends) true
                   (= left (clojure.set/difference left newend)) false
                   :else (recur newend (clojure.set/difference left newend)))))))]
    (maze-solution? maze)))

;; alanforr's solution to Crossword puzzle
;; https://4clojure.com/problem/111
;; Write a function that takes a string and a partially-filled crossword puzzle board, and determines if the input string can be legally placed onto the board.

;; The crossword puzzle board consists of a collection of partially-filled rows. Empty spaces are denoted with an underscore (_), unusable spaces are denoted with a hash symbol (#), and pre-filled spaces have a character in place; the whitespace characters are for legibility and should be ignored.

;; For a word to be legally placed on the board:
;; - It may use empty spaces (underscores)
;; - It may use but must not conflict with any pre-filled characters.
;; - It must not use any unusable spaces (hashes).
;; - There must be no empty spaces (underscores) or extra characters before or after the word (the word may be bound by unusable spaces though).
;; - Characters are not case-sensitive.
;; - Words may be placed vertically (proceeding top-down only), or horizontally (proceeding left-right only).
;; 	
;; (= true  (__ "the" ["_ # _ _ e"]))
;; 	
;; (= false (__ "the" ["c _ _ _"
;;                     "d _ # e"
;;                     "r y _ _"]))
;; 	
;; (= true  (__ "joy" ["c _ _ _"
;;                     "d _ # e"
;;                     "r y _ _"]))
;; 	
;; (= false (__ "joy" ["c o n j"
;;                     "_ _ y _"
;;                     "r _ _ #"]))
;; 	
;; (= true  (__ "clojure" ["_ _ _ # j o y"
;;                         "_ _ o _ _ _ _"
;;                         "_ _ f _ # _ _"]))
 


(fn [word crossword]
  (letfn [(rowsandcols [c]
            (let [sprf (fn [r] (remove #(= \space %) r))
                  nsp (map sprf c)
                  cols (apply map vector nsp)]
              (concat nsp cols)))
          (remove-unusable [c]
            (letfn [(rc [r]
                      (if (some #(= \# %) r)
                        [(take-while #(not= \# %) r) (rest (drop-while #(not= \# %) r))]
                        [r]))]
              (mapcat rc c)))
          (match-letter [l s] (or (= l s) (= \_ s)))
          (match-word [w r]
            (if (= (count w) (count r))
              (every? identity (map-indexed #(match-letter (nth w %1) %2) r))
              false))
          (crossword-sol? [w c]
            (let [rcs (rowsandcols c)
                  wtm (remove-unusable rcs)]
              (if (some true? (map #(match-word w %) wtm)) true false)))]
    (crossword-sol? word crossword)))

;; alanforr's solution to Gus' Quinundrum
;; https://4clojure.com/problem/125
;; Create a function of no arguments which returns a string that is an exact copy of the function itself.

;; Hint: read this if you get stuck (this question is harder than it first appears); but it's worth the effort to solve it independently if you can!

;; Fun fact: Gus is the name of the 4Clojure dragon.
;; 	
;; (= (str '__) (__))


(fn [] (let [x ["(fn [] (let [x " "] (apply str (x 0) x (x 1))))"]] (apply str (x 0) x (x 1))))

;; alanforr's solution to Tree reparenting
;; https://4clojure.com/problem/130
;; Every node of a tree is connected to each of its children as well as its parent. One can imagine grabbing one node of a tree and dragging it up to the root position, leaving all connections intact. For example, below on the left is a binary tree. By pulling the "c" node up to the root, we obtain the tree on the right.

;; Note it is no longer binary as "c" had three connections total -- two children and one parent. Each node is represented as a vector, which always has at least one element giving the name of the node as a symbol. Subsequent items in the vector represent the children of the node. Because the children are ordered it's important that the tree you return keeps the children of each node in order and that the old parent node, if any, is appended on the right. Your function will be given two args -- the name of the node that should become the new root, and the tree to transform.
;; 	
;; (= '(n)
;;    (__ 'n '(n)))
;; 	
;; (= '(a (t (e)))
;;    (__ 'a '(t (e) (a))))
;; 	
;; (= '(e (t (a)))
;;    (__ 'e '(a (t (e)))))
;; 	
;; (= '(a (b (c)))
;;    (__ 'a '(c (b (a)))))
;; 	
;; (= '(d 
;;       (b
;;         (c)
;;         (e)
;;         (a 
;;           (f 
;;             (g) 
;;             (h)))))
;;   (__ 'd '(a
;;             (b 
;;               (c) 
;;               (d) 
;;               (e))
;;             (f 
;;               (g)
;;               (h)))))
;; 	
;; (= '(c 
;;       (d) 
;;       (e) 
;;       (b
;;         (f 
;;           (g) 
;;           (h))
;;         (a
;;           (i
;;           (j
;;             (k)
;;             (l))
;;           (m
;;             (n)
;;             (o))))))
;;    (__ 'c '(a
;;              (b
;;                (c
;;                  (d)
;;                  (e))
;;                (f
;;                  (g)
;;                  (h)))
;;              (i
;;                (j
;;                  (k)
;;                  (l))
;;                (m
;;                  (n)
;;                  (o))))))

(fn [el t]
  (if (= (count t) 1) t
   (let [st (filter seq? (tree-seq seq? identity t))
        elt (first (filter #(= el (first %)) st))
        pelt (first (filter #(some (fn [x] (= x elt)) %) st))
        parents (take-while #(not= pelt %) st)
        allp (reverse (concat parents [pelt] [elt]))
        remprev (fn [i] (remove #(= % (nth allp (dec' i))) (nth allp i)))
        remp (reverse (concat [elt] (map #(remprev %) (rest (range (count allp))))))]
    (loop [res remp]
      (if (= 1 (count res))
        (first res)
        (recur (concat [(concat (second res) [(first res)])] (nthrest res 2))))))))

;; alanforr's solution to Analyze Reversi
;; https://4clojure.com/problem/124
;; Reversi is normally played on an 8 by 8 board. In this problem, a 4 by 4 board is represented as a two-dimensional vector with black, white, and empty pieces represented by 'b, 'w, and 'e, respectively. Create a function that accepts a game board and color as arguments, and returns a map of legal moves for that color. Each key should be the coordinates of a legal move, and its value a set of the coordinates of the pieces flipped by that move.

;; Board coordinates should be as in calls to get-in. For example, [0 1] is the topmost row, second column from the left.


;; 	
;; (= {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}}
;;    (__ '[[e e e e]
;;          [e w b e]
;;          [e b w e]
;;          [e e e e]] 'w))
;; 	
;; (= {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}}
;;    (__ '[[e e e e]
;;          [e w b e]
;;          [w w w e]
;;          [e e e e]] 'b))
;; 	
;; (= {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}}
;;    (__ '[[e e e e]
;;          [e w b e]
;;          [w w b e]
;;          [e e b e]] 'w))
;; 	
;; (= {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 1] [2 2]}}
;;    (__ '[[e e w e]
;;          [b b w e]
;;          [b w w e]
;;          [b w w w]] 'b))
;; (= {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 1] [2 2]}}
;;    (__ '[[e e w e]
;;          [b b w e]
;;          [b w w e]
;;          [b w w w]] 'b))

(fn [board ptype]
  (letfn [(find-els [m el]
            (let [rowinds (filter #(some (fn [x] (= x el)) (nth m %)) (range (count m)))
                  colindf (fn [r] (filter #(= el (nth (nth m r) %)) (range (count (first m)))))
                  rcf (fn [r] (map #(vector r %) (colindf r)))]
              (mapcat rcf rowinds)))
          (lrdiag-plus [p] (map #(vector (- (first p) %) (+ (second p) %)) (rest (range))))
          (lrdiag-minus [p] (map #(vector (+ (first p) %) (- (second p) %)) (rest (range))))
          (rldiag-plus [p] (map #(vector (+ (first p) %) (+ (second p) %)) (rest (range))))
          (rldiag-minus [p] (map #(vector (- (first p) %) (- (second p) %)) (rest (range))))
          (horplus [p] (map #(vector (first p) (+ (second p) %)) (rest (range))))
          (horminus [p] (map #(vector (first p) (- (second p) %)) (rest (range))))
          (verplus [p] (map #(vector (+ (first p) %) (second p)) (rest (range))))
          (verminus [p] (map #(vector (- (first p) %) (second p)) (rest (range))))
          (line [p lf ps] (take-while (fn [x] (some #(= % x) ps)) (lf p)))
          (sps [m el]
            (let [typesps '[b w e]
                  sortedps (zipmap typesps (map #(find-els m %) typesps))
                  other (first (remove #(or (= el %) (= 'e %)) typesps))
                  [spo spel spe] [(sortedps other) (sortedps el) (sortedps 'e)]
                  funcv [lrdiag-plus lrdiag-minus rldiag-plus rldiag-minus horplus horminus verplus verminus]
                  lp (fn [p lf] (let [lspo (line p lf spo)]
                                 (cond
                                  (empty? lspo) []
                                  (empty? (line (last lspo) lf spel)) []
                                  :else lspo)))
                  lspof (fn [p] (let [ps (mapcat #(lp p %) funcv)]
                                 (if (empty? ps) {} {p (set ps)})))]
              (apply merge (map lspof spe))))]
    (sps board ptype)))

;; alanforr's solution to Best Hand
;; https://4clojure.com/problem/178
;; Following on from Recognize Playing Cards, determine the best poker hand that can be made with five cards. The hand rankings are listed below for your convenience.

;; Straight flush: All cards in the same suit, and in sequence
;; Four of a kind: Four of the cards have the same rank
;; Full House: Three cards of one rank, the other two of another rank
;; Flush: All cards in the same suit
;; Straight: All cards in sequence (aces can be high or low, but not both at once)
;; Three of a kind: Three of the cards have the same rank
;; Two pair: Two pairs of cards have the same rank
;; Pair: Two cards have the same rank
;; High card: None of the above conditions are met

;; 	
;; (= :high-card (__ ["HA" "D2" "H3" "C9" "DJ"]))
;; 	
;; (= :pair (__ ["HA" "HQ" "SJ" "DA" "HT"]))
;; 	
;; (= :two-pair (__ ["HA" "DA" "HQ" "SQ" "HT"]))
;; 	
;; (= :three-of-a-kind (__ ["HA" "DA" "CA" "HJ" "HT"]))
;; 	
;; (= :straight (__ ["HA" "DK" "HQ" "HJ" "HT"]))
;; 	
;; (= :straight (__ ["HA" "H2" "S3" "D4" "C5"]))
;; 	
;; (= :flush (__ ["HA" "HK" "H2" "H4" "HT"]))
	
;; (= :full-house (__ ["HA" "DA" "CA" "HJ" "DJ"]))
	
;; (= :four-of-a-kind (__ ["HA" "DA" "CA" "SA" "DJ"]))
	
;; (= :straight-flush (__ ["HA" "HK" "HQ" "HJ" "HT"]))
 

(fn [hand]
  (letfn [(suits [h] (map first h))
          (ranks [h] (map second h))
          (same [s] (apply = s))
          (nums [r ah?]
            (cond
             (= r \J) 11
             (= r \T) 10
             (= r \Q) 12
             (= r \K) 13
             (= r \A) (if ah? 14 1)
             :else (read-string (str r))))
          (in-sequence? [ns]
            (let [sns (sort ns)
                  diffs (map #(-' (nth sns %) (nth sns (dec' %))) (range 1 (count ns)))]
              (every? identity (map #(= 1 %) diffs))))
          (best-hand [h]
            (let [s (suits h)
                  r (ranks h)
                  nsh (map #(nums % true) r)
                  nsl (map #(nums % false) r)
                  ins? (or (in-sequence? nsh) (in-sequence? nsl))
                  sames? (same s)
                  rcs (vals (frequencies r))
                  num? (fn [n] (some #(= n %) rcs))
                  numpairs ((frequencies rcs) 2)]
              (cond
               (and ins? sames?) :straight-flush
               (num? 4) :four-of-a-kind
               (and (num? 3) (num? 2)) :full-house
               sames? :flush
               ins? :straight
               (num? 3) :three-of-a-kind
               (= numpairs 2) :two-pair
               (= numpairs 1) :pair
               :else :high-card)))]
    (best-hand hand)))

;; alanforr's solution to Squares Squared
;; https://4clojure.com/problem/138
;; Create a function of two integer arguments: the start and end, respectively. You must create a vector of strings which renders a 45° rotated square of integers which are successive squares from the start point up to and including the end point. If a number comprises multiple digits, wrap them around the shape individually. If there are not enough digits to complete the shape, fill in the rest with asterisk characters. The direction of the drawing should be clockwise, starting from the center of the shape and working outwards, with the initial direction being down and to the right.
	
;; (= (__ 2 2) ["2"])
	
;; (= (__ 2 4) [" 2 "
;;              "* 4"
;;              " * "])
	
;; (= (__ 3 81) [" 3 "
;;               "1 9"
;;               " 8 "])
	
;; (= (__ 4 20) [" 4 "
;;               "* 1"
;;               " 6 "])
	
;; (= (__ 2 256) ["  6  "
;;                " 5 * "
;;                "2 2 *"
;;                " 6 4 "
;;                "  1  "])
	
;; (= (__ 10 10000) ["   0   "
;;                   "  1 0  "
;;                   " 0 1 0 "
;;                   "* 0 0 0"
;;                   " * 1 * "
;;                   "  * *  "
;;                   "   *   "])

(fn [n1 n2]
  (letfn [(square [a] (*' a a))
          (sqs [a b] (take-while #(<= % b) (iterate square a)))
          (ndigs [a b] (count (apply str (sqs a b))))
          (sqsize [a b] (first (drop-while #(< (square %) (ndigs a b)) (range))))
          (fillout [a b] (apply str (concat (sqs a b) (repeat (- (square (sqsize a b)) (ndigs a b)) \*))))
          (next-layer [cl n below?]
            (let [addtorowents (partition 1 (range (*' n n) (+' n (*' n n)) ))
                  addtorows (if below? addtorowents (reverse addtorowents))
                  newrowents (range (+' n (*' n n)) (*' (inc' n) (inc' n)))
                  newrow (if below? (reverse newrowents) newrowents)
                  rowswithadds (if below?
                                 (map-indexed (fn [i k] (concat (nth cl i) (nth addtorows i))) cl)
                                 (map-indexed (fn [i k] (concat (nth addtorows i) (nth cl i))) cl))]
              (if below?
                (concat rowswithadds [newrow])
                (concat [newrow] rowswithadds))))
          (square-spiral [n]
            (loop [c 0 res [[0]]]
              (if (= c n)
                res
                (recur (inc' c) (next-layer res (inc' c) (even? c))))))
          (get-el [s [r c]] (nth (nth s r) c))
          (diag-lr [s n]
            (reverse
             (for [x (range (inc' n))
                   y (range (inc' n))
                   :when (and (< x (count s)) (< y (count s))  (= n (+' x y)))]
               (get-el s [x y]))))
          (diag-spiral [n]
            (let [sp (square-spiral n)
                  nds (inc' (*' 2 n))]
              (map #(diag-lr sp %) (range nds))))
          (make-square [a b]
            (let [size (sqsize a b)
                  stsize (dec' (*' 2 size))
                  stab (fillout a b)
                  ds (diag-spiral (dec' size))
                  linef (fn [s c] (map #(nth s %) c))
                  wos (map  #(linef stab %) ds)
                  inbetspaces (fn [s] (butlast (interleave s (repeat (count s) " "))))
                  ws (map inbetspaces wos)
                  cs (map #(repeat (/ (-' stsize (count %)) 2) " ") ws)
                  allthings (map #(concat (nth cs %) (nth ws %) (nth cs %)) (range (count ds)))]
              (map #(apply str %) allthings)))]
    (make-square n1 n2)))

;; alanforr's solution to Language of a DFA
;; https://4clojure.com/problem/164
;; A deterministic finite automaton (DFA) is an abstract machine that recognizes a regular language. Usually a DFA is defined by a 5-tuple, but instead we'll use a map with 5 keys:
;; :states is the set of states for the DFA.
;; :alphabet is the set of symbols included in the language recognized by the DFA.
;; :start is the start state of the DFA.
;; :accepts is the set of accept states in the DFA.
;; :transitions is the transition function for the DFA, mapping :states ⨯ :alphabet onto :states.
;; Write a function that takes as input a DFA definition (as described above) and returns a sequence enumerating all strings in the language recognized by the DFA. Note: Although the DFA itself is finite and only recognizes finite-length strings it can still recognize an infinite set of finite-length strings. And because stack space is finite, make sure you don't get stuck in an infinite loop that's not producing results every so often!
	
;; (= #{"a" "ab" "abc"}
;;    (set (__ '{:states #{q0 q1 q2 q3}
;;               :alphabet #{a b c}
;;               :start q0
;;               :accepts #{q1 q2 q3}
;;               :transitions {q0 {a q1}
;;                             q1 {b q2}
;;                             q2 {c q3}}})))
	
;; (= #{"hi" "hey" "hello"}
;;    (set (__ '{:states #{q0 q1 q2 q3 q4 q5 q6 q7}
;;               :alphabet #{e h i l o y}
;;               :start q0
;;               :accepts #{q2 q4 q7}
;;               :transitions {q0 {h q1}
;;                             q1 {i q2, e q3}
;;                             q3 {l q5, y q4}
;;                             q5 {l q6}
;;                             q6 {o q7}}})))
	
;; (= (set (let [ss "vwxyz"] (for [i ss, j ss, k ss, l ss] (str i j k l))))
;;    (set (__ '{:states #{q0 q1 q2 q3 q4}
;;               :alphabet #{v w x y z}
;;               :start q0
;;               :accepts #{q4}
;;               :transitions {q0 {v q1, w q1, x q1, y q1, z q1}
;;                             q1 {v q2, w q2, x q2, y q2, z q2}
;;                             q2 {v q3, w q3, x q3, y q3, z q3}
;;                             q3 {v q4, w q4, x q4, y q4, z q4}}})))
	
;; (let [res (take 2000 (__ '{:states #{q0 q1}
;;                            :alphabet #{0 1}
;;                            :start q0
;;                            :accepts #{q0}
;;                            :transitions {q0 {0 q0, 1 q1}
;;                                          q1 {0 q1, 1 q0}}}))]
;;   (and (every? (partial re-matches #"0*(?:10*10*)*") res)
;;        (= res (distinct res))))
	
;; (let [res (take 2000 (__ '{:states #{q0 q1}
;;                            :alphabet #{n m}
;;                            :start q0
;;                            :accepts #{q1}
;;                            :transitions {q0 {n q0, m q1}}}))]
;;   (and (every? (partial re-matches #"n*m") res)
;;        (= res (distinct res))))
	
;; (let [res (take 2000 (__ '{:states #{q0 q1 q2 q3 q4 q5 q6 q7 q8 q9}
;;                            :alphabet #{i l o m p t}
;;                            :start q0
;;                            :accepts #{q5 q8}
;;                            :transitions {q0 {l q1}
;;                                          q1 {i q2, o q6}
;;                                          q2 {m q3}
;;                                          q3 {i q4}
;;                                          q4 {t q5}
;;                                          q6 {o q7}
;;                                          q7 {p q8}
;;                                          q8 {l q9}
;;                                          q9 {o q6}}}))]
;;   (and (every? (partial re-matches #"limit|(?:loop)+") res)
;;        (= res (distinct res))))
 


(fn [dfa]
  (letfn [(trans [e d]
            (let [s (get (:transitions d) (val e))]
              (if s (map #(hash-map (concat (key e) [(key %)]) (val %)) s))))
          (next-state [curr d]
            (let [smaps (map #(trans % d) curr)]
              (apply merge (flatten smaps))))
          (get-acc [d ns]
            (filter #((:accepts d) (val %)) ns))
          (mape-to-str [e]
            (apply str (key e)))
          (lingo [curr d]
            (let [ns (next-state curr d)]
              (if ns
                (lazy-cat (map mape-to-str (get-acc d ns)) (lingo ns d)))))]
    (lingo {[] (dfa :start)} dfa)))

;; alanforr's solution to Love Triangle
;; https://4clojure.com/problem/127
;; Everyone loves triangles, and it's easy to understand why—they're so wonderfully symmetric (except scalenes, they suck).

;; Your passion for triangles has led you to become a miner (and part-time Clojure programmer) where you work all day to chip out isosceles-shaped minerals from rocks gathered in a nearby open-pit mine. There are too many rocks coming from the mine to harvest them all so you've been tasked with writing a program to analyze the mineral patterns of each rock, and determine which rocks have the biggest minerals.

;; Someone has already written a computer-vision system for the mine. It images each rock as it comes into the processing centre and creates a cross-sectional bitmap of mineral (1) and rock (0) concentrations for each one.

;; You must now create a function which accepts a collection of integers, each integer when read in base-2 gives the bit-representation of the rock (again, 1s are mineral and 0s are worthless scalene-like rock). You must return the cross-sectional area of the largest harvestable mineral from the input rock, as follows:
;; The minerals only have smooth faces when sheared vertically or horizontally from the rock's cross-section
;; The mine is only concerned with harvesting isosceles triangles (such that one or two sides can be sheared)
;; If only one face of the mineral is sheared, its opposing vertex must be a point (ie. the smooth face must be of odd length), and its two equal-length sides must intersect the shear face at 45° (ie. those sides must cut even-diagonally)
;; The harvested mineral may not contain any traces of rock
;; The mineral may lie in any orientation in the plane
;; Area should be calculated as the sum of 1s that comprise the mineral
;; Minerals must have a minimum of three measures of area to be harvested
;; If no minerals can be harvested from the rock, your function should return nil

	
;; (= 10 (__ [15 15 15 15 15]))
;; ; 1111      1111
;; ; 1111      *111
;; ; 1111  ->  **11
;; ; 1111      ***1
;; ; 1111      ****
	
;; (= 15 (__ [1 3 7 15 31]))
;; ; 00001      0000*
;; ; 00011      000**
;; ; 00111  ->  00***
;; ; 01111      0****
;; ; 11111      *****
	
;; (= 3 (__ [3 3]))
;; ; 11      *1
;; ; 11  ->  **
	
;; (= 4 (__ [7 3]))
;; ; 111      ***
;; ; 011  ->  0*1
	
;; (= 6 (__ [17 22 6 14 22]))
;; ; 10001      10001
;; ; 10110      101*0
;; ; 00110  ->  00**0
;; ; 01110      0***0
;; ; 10110      10110
	
;; (= 9 (__ [18 7 14 14 6 3]))
;; ; 10010      10010
;; ; 00111      001*0
;; ; 01110      01**0
;; ; 01110  ->  0***0
;; ; 00110      00**0
;; ; 00011      000*1
	
;; (= nil (__ [21 10 21 10]))
;; ; 10101      10101
;; ; 01010      01010
;; ; 10101  ->  10101
;; ; 01010      01010
	
;; (= nil (__ [0 31 0 31 0]))
;; ; 00000      00000
;; ; 11111      11111
;; ; 00000  ->  00000
;; ; 11111      11111
;; ; 00000      00000

(fn [c]
  (letfn [(digs [n base]
            (if (zero? n)
              [0]
              (let [divvy (take-while #(<= 1 %) (iterate #(int (/ % base)) n))
                    digbackw (map #(rem % base) divvy)]
                (reverse digbackw))))
          (bindigs [n] (digs n 2))
          (fillout [fill vs]
            (let [numels (map #(conj [(count %)] %) vs)
                  maxc (apply max (map first numels))
                  fillf (fn [v m] (concat (repeat (-' m (first v)) fill) (second v)))]
              (map #(fillf % maxc) numels)))
          (find-els [m el]
            (let [rowinds (filter #(some (fn [x] (= x el)) (nth m %)) (range (count m)))
                  colindf (fn [r] (filter #(= el (nth (nth m r) %)) (range (count (first m)))))
                  rcf (fn [r] (map #(vector r %) (colindf r)))]
              (mapcat rcf rowinds)))
          (mrbitmap [cbm] (fillout 0 (map bindigs cbm)))
          (mins [mrb] (find-els mrb 1))
          (nrtri [pr side]
            (let [mid (map #(vector (inc (first %)) (second %)) pr)]
              (cond
               (= side :left) (concat [[(first (first mid)) (dec (second (first mid)))]] mid)
               (= side :right) (concat mid  [[(first (last mid)) (inc (second (last mid)))]])
               (= side :middle) (concat [[(first (first mid)) (dec (second (first mid)))]]  mid [[(first (last mid)) (inc (second (last mid)))]]))))
          (tri-side [p m side]
            (loop [tri [[p]] left (set m)]
              (let [nr (nrtri (last tri) side)
                    nrs (set nr)]
                (if (clojure.set/subset? nrs left)
                  (recur (conj tri nr) (clojure.set/difference left nrs))
                  (apply concat tri)))))
          (tris-p [p m] (map #(tri-side p m %) [:left :right :middle]))
          (tris-or [m] (mapcat #(tris-p % m) m))
          (all-ors [cbm]
            (let [mrb (mrbitmap cbm)
                  mrbu (reverse mrb)
                  mrbs (apply map vector mrb)
                  mrbsu (reverse mrbs)]
              (map mins [mrb mrbu mrbs mrbsu])))
          (all-tris [cbm] (mapcat tris-or (all-ors cbm)))
          (countmins [cbm]
            (let [tris (all-tris cbm)
                  m (apply max (map count tris))]
              (if (<= 3 m) m nil)))]
    (countmins c)))

;; alanforr's solution to Latin Square Slicing
;; https://4clojure.com/problem/152
;; A Latin square of order n is an n x n array that contains n different elements, each occurring exactly once in each row, and exactly once in each column. For example, among the following arrays only the first one forms a Latin square:

;; 1
;; 2
;; 3
;; 4
;; A B C    A B C    A B C
;; B C A    B C A    B D A
;; C A B    C A C    C A B
 
;; Let V be a vector of such vectors1 that they may differ in length2. We will say that an arrangement of vectors of V in consecutive rows is an alignment (of vectors) of V if the following conditions are satisfied:

;; All vectors of V are used.
;; Each row contains just one vector.
;; The order of V is preserved.
;; All vectors of maximal length are horizontally aligned each other.
;; If a vector is not of maximal length then all its elements are aligned with elements of some subvector of a vector of maximal length.
;; Let L denote a Latin square of order 2 or greater. We will say that L is included in V or that V includes L iff there exists an alignment of V such that contains a subsquare that is equal to L.
;; For example, if V equals [[1 2 3][2 3 1 2 1][3 1 2]] then there are nine alignments of V (brackets omitted):

;; 1
;; 2
;; 3
;; 4
;; 5
;; 6
;; 7
;; 8
;; 9
;; 10
;; 11
;; 12
;; 13
;; 14
;; 15
 
;;         1              2              3
 
;;       1 2 3          1 2 3          1 2 3
;;   A   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;       3 1 2        3 1 2        3 1 2
 
;;       1 2 3          1 2 3          1 2 3
;;   B   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;         3 1 2        3 1 2        3 1 2
 
;;       1 2 3          1 2 3          1 2 3
;;   C   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;           3 1 2        3 1 2        3 1 2
 
;; Alignment A1 contains Latin square [[1 2 3][2 3 1][3 1 2]], alignments A2, A3, B1, B2, B3 contain no Latin squares, and alignments C1, C2, C3 contain [[2 1][1 2]]. Thus in this case V includes one Latin square of order 3 and one of order 2 which is included three times.
;; Our aim is to implement a function which accepts a vector of vectors V as an argument, and returns a map which keys and values are integers. Each key should be the order of a Latin square included in V, and its value a count of different Latin squares of that order included in V. If V does not include any Latin squares an empty map should be returned. In the previous example the correct output of such a function is {3 1, 2 1} and not {3 1, 2 3}.

;; 1 Of course, we can consider sequences instead of vectors.
;; 2 Length of a vector is the number of elements in the vector.


	
;; (= (__ '[[A B C D]
;;          [A C D B]
;;          [B A D C]
;;          [D C A B]])
;;    {})
	
;; (= (__ '[[A B C D E F]
;;          [B C D E F A]
;;          [C D E F A B]
;;          [D E F A B C]
;;          [E F A B C D]
;;          [F A B C D E]])
;;    {6 1})
	
;; (= (__ '[[A B C D]
;;          [B A D C]
;;          [D C B A]
;;          [C D A B]])
;;    {4 1, 2 4})
	
;; (= (__ '[[B D A C B]
;;          [D A B C A]
;;          [A B C A B]
;;          [B C A B C]
;;          [A D B C A]])
;;    {3 3})
	
;; (= (__ [  [2 4 6 3]
;;         [3 4 6 2]
;;           [6 2 4]  ])
;;    {})
	
;; (= (__ [[1]
;;         [1 2 1 2]
;;         [2 1 2 1]
;;         [1 2 1 2]
;;         []       ])
;;    {2 2})
	
;; (= (__ [[3 1 2]
;;         [1 2 3 1 3 4]
;;         [2 3 1 3]    ])
;;    {3 1, 2 2})
	
;; (= (__ [[8 6 7 3 2 5 1 4]
;;         [6 8 3 7]
;;         [7 3 8 6]
;;         [3 7 6 8 1 4 5 2]
;;               [1 8 5 2 4]
;;               [8 1 2 4 5]])
;;    {4 1, 3 1, 2 7})
;; (= (__ [[8 6 7 3 2 5 1 4]
;;         [6 8 3 7]
;;         [7 3 8 6]
;;         [3 7 6 8 1 4 5 2]
;;               [1 8 5 2 4]
;;               [8 1 2 4 5]])
;;    {4 1, 3 1, 2 7})


(fn [rows]
  (letfn [(diff? [vs] (= vs (distinct vs)))
          (all-true? [c] (every? identity c))
          (rows-diff? [rs] (all-true? (map diff? rs)))
          (cols-diff? [rs] (rows-diff? (apply map vector rs)))
          (no-nils? [rs]  (not (some true? (map #(some nil? %) rs))))
          (same-els-rows [rs] (= 1 (count (set (map set rs)))))
          (latin-square? [vs] (and (no-nils? vs) (same-els-rows vs) (rows-diff? vs) (cols-diff? vs)))
          (get-sub-square [vs [tcelx tcely] sidea]
            (if (and (<= (+ tcelx sidea) (dec (count (first vs))))
                     (<= (+ tcely sidea) (dec (count vs))))
              (map #(subvec (nth vs %) tcelx (inc (+ tcelx sidea)))
                   (range tcely (inc (+ tcely sidea))))
              []))
          (forv [ca cb] (mapcat (fn [a] (map (fn [b] [a b]) cb)) ca))
          (forsq [vs ts mc]  (mapcat (fn [t] (map (fn [s] (get-sub-square vs t s)) (range 1 mc))) ts))
          (sub-squares [vs]
            (let [cy (count vs)
                  cx (count (first vs))
                  minc (min cx cy)
                  tcels (forv (range (dec cx)) (range (dec cy)))
                  swithes (forsq vs tcels minc)]
              (distinct (remove empty? swithes))))
          (only-latins [vs] (filter latin-square? (sub-squares vs)))
          (count-counts [cs] (frequencies (map #(count (first %)) cs)))
          (fillvs [d]
            (let [rd (range (inc d))
                  allvs (forv rd rd)]
              (filter (fn [[v1 v2]] (= (+ v1 v2) d)) allvs)))
          (fillmeup [[v1 v2] fv c]  (vec (concat (repeat v1 fv) c (repeat v2 fv))))
          (all-fills [c n fv]
            (let [cc (count c)
                  d (- n cc)]
              (if (= cc n) [c]
                  (let [vs (fillvs d)]
                    (map #(fillmeup % fv c) vs)))))
          (for-cat [v1 v2] (mapcat (fn [a] (map (fn [b] (concat a [b])) v2)) v1))
          (for-all [vs] (reduce for-cat [[]] vs))
          (alignments [vs]
            (let [cv (count vs)
                  cs (map count vs)
                  mc (apply max cs)
                  filled (map #(all-fills % mc nil) vs)]
              (map vec (for-all filled))))
          (count-latin-squares [vs]
            (let [as (alignments vs)
                  ols (distinct (mapcat only-latins as))]
              (count-counts ols)))]
    (count-latin-squares rows)))

;; alanforr's solution to Parentheses... Again
;; https://4clojure.com/problem/195
;; In a family of languages like Lisp, having balanced parentheses is a defining feature of the language. Luckily, Lisp has almost no syntax, except for these "delimiters" -- and that hardly qualifies as "syntax", at least in any useful computer programming sense.

;; It is not a difficult exercise to find all the combinations of well-formed parentheses if we only have N pairs to work with. For instance, if we only have 2 pairs, we only have two possible combinations: "()()" and "(())". Any other combination of length 4 is ill-formed. Can you see why?

;; Generate all possible combinations of well-formed parentheses of length 2n (n pairs of parentheses). For this problem, we only consider '(' and ')', but the answer is similar if you work with only {} or only [].

;; There is an interesting pattern in the numbers!


	
;; (= [#{""} #{"()"} #{"()()" "(())"}] (map (fn [n] (__ n)) [0 1 2]))
	
;; (= #{"((()))" "()()()" "()(())" "(())()" "(()())"} (__ 3))
	
;; (= 16796 (count (__ 10)))
	
;; (= (nth (sort (filter #(.contains ^String % "(()()()())") (__ 9))) 6) "(((()()()())(())))")
	
;; (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))")

(fn [n]
  (letfn [(add-brackets [open close]
                        (lazy-seq
                         (concat
                          (when (pos? open)
                            (map #(cons \( %)
                                 (add-brackets (dec open) (inc close))))
                          (when (pos? close)
                            (map #(cons \) %)
                                 (add-brackets open (dec close))))
                          (when (= [0 0] [open close]) [""]))))
          (parentheses [nu] (set (map #(apply str %) (add-brackets nu 0))))]
    (parentheses n)))

;; alanforr's solution to Veitch, Please!
;; https://4clojure.com/problem/140
;; Create a function which accepts as input a boolean algebra function in the form of a set of sets, where the inner sets are collections of symbols corresponding to the input boolean variables which satisfy the function (the inputs of the inner sets are conjoint, and the sets themselves are disjoint... also known as canonical minterms). Note: capitalized symbols represent truth, and lower-case symbols represent negation of the inputs. Your function must return the minimal function which is logically equivalent to the input.
;;
;; PS — You may want to give this a read before proceeding: K-Maps http://en.wikipedia.org/wiki/K_map
;;
;; (= (__ #{#{'a 'B 'C 'd}
;;        #{'A 'b 'c 'd}
;;        #{'A 'b 'c 'D}
;;        #{'A 'b 'C 'd}
;;        #{'A 'b 'C 'D}
;;        #{'A 'B 'c 'd}
;;        #{'A 'B 'c 'D}
;;        #{'A 'B 'C 'd}})
;;  #{#{'A 'c} 
;;    #{'A 'b}
;;    #{'B 'C 'd}})
;; (= (__ #{#{'A 'B 'C 'D}
;;          #{'A 'B 'C 'd}})
;;    #{#{'A 'B 'C}})
;; (= (__ #{#{'a 'b 'c 'd}
;;          #{'a 'B 'c 'd}
;;          #{'a 'b 'c 'D}
;;          #{'a 'B 'c 'D}
;;          #{'A 'B 'C 'd}
;;          #{'A 'B 'C 'D}
;;          #{'A 'b 'C 'd}
;;          #{'A 'b 'C 'D}})
;;    #{#{'a 'c}
;;      #{'A 'C}})
;; (= (__ #{#{'a 'b 'c} 
;;          #{'a 'B 'c}
;;          #{'a 'b 'C}
;;          #{'a 'B 'C}})
;;    #{#{'a}})
;; (= (__ #{#{'a 'B 'c 'd}
;;          #{'A 'B 'c 'D}
;;          #{'A 'b 'C 'D}
;;          #{'a 'b 'c 'D}
;;          #{'a 'B 'C 'D}
;;          #{'A 'B 'C 'd}})
;;    #{#{'a 'B 'c 'd}
;;      #{'A 'B 'c 'D}
;;      #{'A 'b 'C 'D}
;;      #{'a 'b 'c 'D}
;;      #{'a 'B 'C 'D}
;;      #{'A 'B 'C 'd}})
;; (= (__ #{#{'a 'b 'c 'd}
;;          #{'a 'B 'c 'd}
;;          #{'A 'B 'c 'd}
;;          #{'a 'b 'c 'D}
;;          #{'a 'B 'c 'D}
;;          #{'A 'B 'c 'D}})
;;    #{#{'a 'c}
;;      #{'B 'c}})
;; (= (__ #{#{'a 'B 'c 'd}
;;          #{'A 'B 'c 'd}
;;          #{'a 'b 'c 'D}
;;          #{'a 'b 'C 'D}
;;          #{'A 'b 'c 'D}
;;          #{'A 'b 'C 'D}
;;          #{'a 'B 'C 'd}
;;          #{'A 'B 'C 'd}})
;;    #{#{'B 'd}
;;      #{'b 'D}})
;; (= (__ #{#{'a 'b 'c 'd}
;;          #{'A 'b 'c 'd}
;;          #{'a 'B 'c 'D}
;;          #{'A 'B 'c 'D}
;;          #{'a 'B 'C 'D}
;;          #{'A 'B 'C 'D}
;;          #{'a 'b 'C 'd}
;;          #{'A 'b 'C 'd}})
;;    #{#{'B 'D}
;;      #{'b 'd}})

(fn [sb]
  (let [ones ['A 'B 'C 'D]
        zeros ['a 'b 'c 'd]
        pairs (map set (map vector ones zeros))
        count-ones (fn [s] (count (clojure.set/intersection s (set ones))))
        group-by-ones (fn [s] (group-by count-ones s))
        number-differences (fn [s1 s2] (count (clojure.set/difference s1 s2)))
        neighbour? (fn [s1 s2] (= 1 (number-differences s1 s2)))
        compare-groups (fn [g1 g2]
                         (set
                           (for [x g1
                                 y g2
                                 :let [z (clojure.set/intersection x y)]
                                 :when (neighbour? x y)]
                             z)))
        symm-difference (fn [s1 s2]
                          (clojure.set/union
                            (clojure.set/difference s1 s2)
                            (clojure.set/difference s2 s1)))
        dontcare (fn [s1 s2] (some #(= (symm-difference s1 s2) %) pairs))
        remove-overlaps (fn [g1 g2] (set (remove (fn [g] (some #(= 1 (number-differences g %)) g2)) g1)))
        remove-dontcares (fn [g] (set (remove (fn [gm] (some #(dontcare gm %) g)) g)))
        map-over-map-keys-vals (fn [m f] (let [km (keys m)] (zipmap km (map f km (vals m)))))
        compare-adjacent-groups (fn [m] (map-over-map-keys-vals m (fn [k v] (compare-groups v (m (inc k))))))
        flatten-gbos (fn [gbo] (apply clojure.set/union (vals gbo)))
        qm (fn [s]
             (let [gbo (group-by-ones s)
                   threes (compare-adjacent-groups gbo)
                   twos (compare-adjacent-groups threes)
                   fthrees (flatten-gbos threes)
                   ftwos (flatten-gbos twos)
                   finalthrees (remove-dontcares fthrees)
                   finaltwos (remove-dontcares (remove-overlaps ftwos finalthrees))
                   res (clojure.set/union finalthrees finaltwos)]
               (if (empty? res) s res)))]
    (qm sb)))
