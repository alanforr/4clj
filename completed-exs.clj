;; alanforr's solution to Nothing but the Truth
;; https://4clojure.com/problem/1

true

;; alanforr's solution to Simple Math
;; https://4clojure.com/problem/2

4

;; alanforr's solution to Intro to Strings
;; https://4clojure.com/problem/3

"HELLO WORLD"

;; alanforr's solution to Intro to Lists
;; https://4clojure.com/problem/4

:a :b :c

;; alanforr's solution to Lists: conj
;; https://4clojure.com/problem/5

'(1 2 3 4)

;; alanforr's solution to Intro to Vectors
;; https://4clojure.com/problem/6

:a :b :c

;; alanforr's solution to Vectors: conj
;; https://4clojure.com/problem/7

[1 2 3 4]

;; alanforr's solution to Intro to Sets
;; https://4clojure.com/problem/8

#{:a :b :c :d}

;; alanforr's solution to Sets: conj
;; https://4clojure.com/problem/9

2

;; alanforr's solution to Intro to Maps
;; https://4clojure.com/problem/10

20

;; alanforr's solution to Maps: conj
;; https://4clojure.com/problem/11

[:b 2]

;; alanforr's solution to Intro to Sequences
;; https://4clojure.com/problem/12

3

;; alanforr's solution to Sequences: rest
;; https://4clojure.com/problem/13

[20 30 40]

;; alanforr's solution to Intro to Functions
;; https://4clojure.com/problem/14

8

;; alanforr's solution to Double Down
;; https://4clojure.com/problem/15

(fn [x] (* 2 x))

;; alanforr's solution to Hello World
;; https://4clojure.com/problem/16

(fn [x] (str "Hello, " x "!"))

;; alanforr's solution to Sequences: map
;; https://4clojure.com/problem/17

'(6 7 8)

;; alanforr's solution to Sequences: filter
;; https://4clojure.com/problem/18

'(6 7)

;; alanforr's solution to Local bindings
;; https://4clojure.com/problem/35

7

;; alanforr's solution to Let it Be
;; https://4clojure.com/problem/36

[x 7 y 3 z 1]

;; alanforr's solution to Regular Expressions
;; https://4clojure.com/problem/37

"ABC"

;; alanforr's solution to Intro to Reduce
;; https://4clojure.com/problem/64

+

;; alanforr's solution to Simple Recursion
;; https://4clojure.com/problem/57

'(5 4 3 2 1)

;; alanforr's solution to Rearranging Code: ->
;; https://4clojure.com/problem/71

last

;; alanforr's solution to Recurring Theme
;; https://4clojure.com/problem/68

'(7 6 5 4 3)

;; alanforr's solution to Rearranging Code: ->>
;; https://4clojure.com/problem/72

apply +

;; alanforr's solution to A nil key
;; https://4clojure.com/problem/134

(fn [x y] (and (contains? y x) (nil? (y x))))

;; alanforr's solution to For the win
;; https://4clojure.com/problem/145

'(1 5 9 13 17 21 25 29 33 37)

;; alanforr's solution to Logical falsity and truth
;; https://4clojure.com/problem/162

1

;; alanforr's solution to Subset and Superset
;; https://4clojure.com/problem/161

#{1 2}

;; alanforr's solution to Map Defaults
;; https://4clojure.com/problem/156

(fn [x y] (let [xs (repeat (count y) x)
               z (map vector y xs)]
           (into {} z)))
;; alanforr's solution to Last Element
;; https://4clojure.com/problem/19

(fn [x] (nth x (- (count x) 1)))

;; alanforr's solution to Penultimate Element
;; https://4clojure.com/problem/20

(fn [x] (nth x (- (count x) 2)))

;; alanforr's solution to Nth Element
;; https://4clojure.com/problem/21

(fn [x n] (first (drop n x)))

;; alanforr's solution to Count a Sequence
;; https://4clojure.com/problem/22

(fn [x]
  (loop [ct 0 thing x]
    (if (empty? thing)
        ct
        (recur (inc ct) (rest thing)))))

;; alanforr's solution to Sum It All Up
;; https://4clojure.com/problem/24

reduce +

;; alanforr's solution to Find the odd numbers
;; https://4clojure.com/problem/25

filter odd?

;; alanforr's solution to Reverse a Sequence
;; https://4clojure.com/problem/23

(fn [x]
  (let [revable (into [] x)
        cx (count x)
        ln (dec' cx)]
    (map #(nth revable (-' ln %)) (range cx))))

;; alanforr's solution to Palindrome Detector
;; https://4clojure.com/problem/27

(fn [x] (= (clojure.string/join x) (clojure.string/join (reverse x))))

;; alanforr's solution to Fibonacci Sequence
;; https://4clojure.com/problem/26

(fn [n]
  (letfn [(fib [a b] (cons a (lazy-seq (fib b (+ b a)))))
          (fib-n [a b n] (take n (fib a b)))]
    (fib-n 1 1 n)))
;; alanforr's solution to Maximum value
;; https://4clojure.com/problem/38

(fn [& x]
      (loop [cnt 0 thing (first x)]
        (if (= cnt (count x))
          thing
          (recur (inc cnt) (if (> (nth x cnt) thing) (nth x cnt) thing)))))

;; alanforr's solution to Get the Caps
;; https://4clojure.com/problem/29

(fn [x] (clojure.string/join (re-seq #"[A-Z]" x)))

;; alanforr's solution to Duplicate a Sequence
;; https://4clojure.com/problem/32

(fn [x] (interleave x x))

;; alanforr's solution to Intro to some
;; https://4clojure.com/problem/48

6

;; alanforr's solution to Implement range
;; https://4clojure.com/problem/34

(fn [x y] (take (- y x) (iterate inc x)))

;; alanforr's solution to Flatten a Sequence
;; https://4clojure.com/problem/28

(fn [s]
  (loop [res [] left s]
    (cond
     (empty? left) res
     (coll? (first left)) (recur res (concat (first left) (rest left)))
     :else (recur (conj res (first left)) (rest left)))))

;; alanforr's solution to Interleave Two Seqs
;; https://4clojure.com/problem/39

(fn [s1 s2] (mapcat #(vector %1 %2) s1 s2))

;; alanforr's solution to Factorial Fun
;; https://4clojure.com/problem/42

(fn [n] (reduce * (range 1 (+ n 1))))

;; alanforr's solution to Compress a Sequence
;; https://4clojure.com/problem/30

(fn [s]
  (loop [res [(first s)] left (rest s)]
    (cond
     (empty? left) res
     (= (last res) (first left)) (recur res (rest left))
     :else (recur (conj res (first left)) (rest left)))))

;; alanforr's solution to Contain Yourself
;; https://4clojure.com/problem/47

4

;; alanforr's solution to Replicate a Sequence
;; https://4clojure.com/problem/33

(fn [s n] (mapcat #(repeat n %) s))

;; alanforr's solution to Intro to Iterate
;; https://4clojure.com/problem/45

'(1 4 7 10 13)

;; alanforr's solution to Interpose a Seq
;; https://4clojure.com/problem/40

(fn [el s]
  (rest
   (interleave
    (repeat (inc (count s)) el)
    s)))

;; alanforr's solution to Pack a Sequence
;; https://4clojure.com/problem/31

(fn [s]
  (loop [res [] left s]
    (if
      (empty? left) res
      (recur (concat res [(take-while #(= (first left) %) left)])
             (drop-while #(= (first left) %) left)))))

;; alanforr's solution to Drop Every Nth Item
;; https://4clojure.com/problem/41

(fn [x n]
      (let
        [indices (remove #(= (- n 1) (mod % n)) (range 0 (count x)))]
        (map #(nth x %) indices)))

;; alanforr's solution to Intro to Destructuring
;; https://4clojure.com/problem/52

(list c e)

;; alanforr's solution to Split a sequence
;; https://4clojure.com/problem/49

(fn [n s] [(take n s) (drop n s)])

;; alanforr's solution to Advanced Destructuring
;; https://4clojure.com/problem/51

[1 2 3 4 5]

;; alanforr's solution to A Half-Truth
;; https://4clojure.com/problem/83

(fn [& x]
  (let [ctruex (count (filter true? x))
        cx (count x)]
    (cond
     (= ctruex cx) false
     (zero? ctruex) false
     :else true)))

;; alanforr's solution to Map Construction
;; https://4clojure.com/problem/61

(fn [c1 c2]
  (let [kvv (map vector c1 c2)
        kvm (map #(apply hash-map %) kvv)]
    (apply merge kvm)))

;; alanforr's solution to Greatest Common Divisor
;; https://4clojure.com/problem/66

(fn [a b]
  (loop [c a d b]
    (cond
     (= d 0) c
     :else (recur d (rem c d)))))

;; alanforr's solution to Comparisons
;; https://4clojure.com/problem/166

(fn [compy x y]
  (cond
   (compy x y) :lt
   (and (not (compy x y)) (not (compy y x))) :eq
   :else :gt))

;; alanforr's solution to Set Intersection
;; https://4clojure.com/problem/81

(fn [s1 s2]
  (clojure.set/difference s1 (clojure.set/difference s1 s2)))

;; alanforr's solution to Re-implement Iterate
;; https://4clojure.com/problem/62

(fn [f x]
  (letfn [(iter [g y] (cons y (lazy-seq (iter g (g y)))))]
    (iter f x)))

;; alanforr's solution to Simple closures
;; https://4clojure.com/problem/107

(fn [b]
  (letfn [(expon [n x] (reduce * (repeat n x)))]
    (partial expon b) ))

;; alanforr's solution to Product Digits
;; https://4clojure.com/problem/99

(fn [x y]
  (let [ds (str (* x y))
        dstrs (map str ds)]
    (map read-string dstrs)))

;; alanforr's solution to Cartesian Product
;; https://4clojure.com/problem/90

(fn [xs ys]
  (set (for [x xs y ys] [x y])))


;; alanforr's solution to Group a Sequence
;; https://4clojure.com/problem/63

(fn [f s]
  (let [vs (distinct (map f s))
        mv (fn [v] {v (filter #(= v (f %)) s)})
        ms (map mv vs)]
    (apply merge ms)))

;; alanforr's solution to Read a binary number
;; https://4clojure.com/problem/122

(fn [a]
  (letfn [(rds [s] (map #(read-string (str %)) s))
          (expon [b n] (if (zero? n) 1 (reduce *' (repeat n b))))
          (convertfrombin [s] (reduce +' (map-indexed (fn [i d] (*' d (expon 2 i))) (reverse (rds s)))))]
    (convertfrombin a)))

;; alanforr's solution to Symmetric Difference
;; https://4clojure.com/problem/88

(fn [x y] (clojure.set/union (clojure.set/difference x y) (clojure.set/difference y x)))

;; alanforr's solution to dot product
;; https://4clojure.com/problem/143

(fn [x y]
      (reduce +
	      (map #(* (nth x %) (nth y %)) (range (count x)))))
;; alanforr's solution to Through the Looking Class
;; https://4clojure.com/problem/126

Class

;; alanforr's solution to Infix Calculator
;; https://4clojure.com/problem/135

(fn [& x]
  (loop [acc (first x) left (partition 2 (rest x))]
    (if (empty? left) acc
        (let [op (first (first left))
              secarg (second (first left))]
          (recur (op acc secarg) (rest left))))))

;; alanforr's solution to Indexing Sequences
;; https://4clojure.com/problem/157

(fn [x] (map vector x (range (count x))))

;; alanforr's solution to Pascal's Triangle
;; https://4clojure.com/problem/97

(fn [x]
  (letfn
    [(factorial [a] (apply * (range 1 (inc a))))
     (ptel [n k]
           (/ (factorial n) (* (factorial k) (factorial (- n k)))))]
    (map #(ptel (dec x) %) (range x))))

;; alanforr's solution to Re-implement Map
;; https://4clojure.com/problem/118

(fn [g y]
  (letfn [(exmap
           ([f x]
            (lazy-seq
             (when-let [thing (seq x)]
               (cons (f (first thing)) (exmap f (rest thing)))))))]
    (exmap g y)))

;; alanforr's solution to Sum of square of digits
;; https://4clojure.com/problem/120

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

x y

;; alanforr's solution to Pascal's Trapezoid
;; https://4clojure.com/problem/147

(fn [ir]
  (letfn [(nextrowtrapezoid [r]
            (let [inds (range (dec' (count r)))
                  addfn (fn [n] (+' (nth r n) (nth r (inc' n))))
                  mid (map addfn inds)]
              (concat [(first r)] mid [(last r)])))]
    (iterate nextrowtrapezoid ir)))

;; alanforr's solution to Beauty is Symmetry
;; https://4clojure.com/problem/96

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

(fn [m]
  (let [km (for [k (keys m)] (conj [k] (keys (m k))))
        keyfn (fn [k] (for [x (second k)] [(first k) x]))
        nks (mapcat keyfn km)
        valfn (fn [[a b]] ((m a) b))
        nmc (for [nk nks] [nk (valfn nk)])]
    (into {} nmc)))

;; alanforr's solution to Pairwise Disjoint Sets
;; https://4clojure.com/problem/153

(fn [s]
  (let [tot (reduce + (map count s))
        over (set (mapcat identity s))]
    (= tot (count over))))

;; alanforr's solution to Flipping out
;; https://4clojure.com/problem/46

(fn [f] (fn [& args] (apply f (reverse args))))

;; alanforr's solution to Rotate Sequence
;; https://4clojure.com/problem/44

(fn [rott b]
  (letfn [(rotation-indices [a r]
                            (map #(mod (+ % r) (count a)) (range (count a))))]
    (map #(nth b %) (rotation-indices b rott))))

;; alanforr's solution to Reverse Interleave
;; https://4clojure.com/problem/43

(fn [a n]
  (let [zindf (fn [off] (map #(+ off (* n %)) (range (/ (count a) n))))
        allinds (map zindf (range n))
        els (fn [is] (map #(nth a %) is))]
    (map els allinds)))

;; alanforr's solution to Split by Type
;; https://4clojure.com/problem/50

(fn [c] (vals (group-by type c)))

;; alanforr's solution to Count Occurrences
;; https://4clojure.com/problem/55

(fn [s]
  (let [d (distinct s)
        f (fn [x] (filter #(= x %) s))
        counts (map count (map f d))]
    (zipmap d counts)))

;; alanforr's solution to Find Distinct Items
;; https://4clojure.com/problem/56

(fn [c]
  (let [rfl (fn [l] (remove #(= (first l) %) l))]
    (loop [res [] left c]
      (if (empty? left)
        res
        (recur (conj res (first left)) (rfl left))))))

;; alanforr's solution to Function Composition
;; https://4clojure.com/problem/58

(fn [& fns]
  (fn [& args]
    (let [[f & fns] (reverse fns)]
      (reduce #(%2 %1) (apply f args) fns))))

;; alanforr's solution to Partition a Sequence
;; https://4clojure.com/problem/54

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

(fn [& fs]
  (fn [& x]
    (reduce #(conj %1 (apply %2 x)) [] fs)))

;; alanforr's solution to Word Sorting
;; https://4clojure.com/problem/70

(fn [e]
  (letfn [(splitonspace [a] (clojure.string/split (clojure.string/triml a) #"\s+"))
          (removepunc [b] (clojure.string/replace b #"[.!?,]" " "))
          (orderstrs [c d] (compare (clojure.string/lower-case c) (clojure.string/lower-case d)))]
    (sort orderstrs  (splitonspace (removepunc e)))))

;; alanforr's solution to Prime Numbers
;; https://4clojure.com/problem/67

(fn [n]
  (letfn [(non-mults [l] (filter #(not= 0 (mod % (first l))) (rest l)) )
          (non-mult-list [l] (cons (first l) (lazy-seq (non-mult-list (non-mults l)))))]
    (take n (non-mult-list (drop 2 (range))))))

;; alanforr's solution to Filter Perfect Squares
;; https://4clojure.com/problem/74

(fn [d]
  (letfn [(mysqrt [a] (int (Math/sqrt a)))
          (perfectsquare? [b] (= b (*' (mysqrt b) (mysqrt b))))
          (getintegers [c] (map #(Integer/parseInt %) (clojure.string/split c #",")))]
    (clojure.string/join "," (filter #(perfectsquare? %) (getintegers d)))))

;; alanforr's solution to Black Box Testing
;; https://4clojure.com/problem/65

(fn [a]
  (let [base (empty a)]
    (cond
     (= base {}) :map
     (= base #{}) :set
     (= base '()) (if (reversible? a) :vector :list))))

;; alanforr's solution to Intro to Trampoline
;; https://4clojure.com/problem/76

[1 3 5 7 9 11]

;; alanforr's solution to Perfect Numbers
;; https://4clojure.com/problem/80

(fn [a] (= a (reduce + (filter #(zero? (mod a %)) (range 1 a)))))

;; alanforr's solution to Anagram Finder
;; https://4clojure.com/problem/77

(fn [d] (letfn
    [(group-into-ana-sets [a] (group-by #(set (seq %)) a))
     (select-non-lonely [b] (filter #(> (count (val %)) 1) b))
     (format-my-shit [c] (set (map #(set (nth % 1)) c)))]
    (-> d group-into-ana-sets select-non-lonely format-my-shit)))

;; alanforr's solution to Sequence Reductions
;; https://4clojure.com/problem/60

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

(fn [a]
  (let [spondash (clojure.string/split a #"-")
        hasdash? (> (count spondash) 1)
        wordsforcamel (fn [b] (map #(clojure.string/capitalize (nth b %)) (range 1 (count b))))]
    (if hasdash?
      (clojure.string/join (concat [(nth spondash 0)] (wordsforcamel spondash)))
      a)))

;; alanforr's solution to Euler's Totient Function
;; https://4clojure.com/problem/75

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

(fn [s]
  (loop [ps #{#{}} leftover s]
    (if (empty? leftover)
      (set ps)
      (let [thingtoadd (map #(clojure.set/union #{(first leftover)} %) ps)]
        (recur (concat ps thingtoadd) (rest leftover))))))

;; alanforr's solution to The Balance of N
;; https://4clojure.com/problem/115

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

(fn [f a] (set (map set (vals (group-by f a)))))

;; alanforr's solution to Identify keys and values
;; https://4clojure.com/problem/105

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

(fn [n base]
    (if (zero? n)
        [0]
     (let [divvy (take-while #(<= 1 %) (iterate #(int (/ % base) ) n))
          digbackw (map #(rem % base) divvy)]
       (reverse digbackw))))

;; alanforr's solution to Sequence of pronunciations
;; https://4clojure.com/problem/110

(fn [a]
    (let [sortthem (fn [b] (partition-by identity b))
          nums (fn [b] (mapcat #(vec (frequencies %)) (sortthem b)))
          pron (fn [b] (mapcat reverse (nums b)))]
      (drop 1 (iterate pron a))))

;; alanforr's solution to Oscilrate
;; https://4clojure.com/problem/144

(fn [a & f]
  (let [funcs (cycle f)
        nfuncs (fn [n] (reverse (take n (cycle f))))
        appyf (fn [b n] ((apply comp (nfuncs n)) b))]
    (cons a (map #(appyf a %) (drop 1 (range))))))

;; alanforr's solution to Lazy Searching
;; https://4clojure.com/problem/108

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

(fn [a]
  (let [seqsintree (fn [b] (filter sequential? (tree-seq sequential? seq b)))]
    (filter #(not-any? coll? %) (seqsintree a))))

;; alanforr's solution to Decurry
;; https://4clojure.com/problem/158

(fn [f] (fn [& args] (reduce (fn [a b] (a b)) f args)))

;; alanforr's solution to Global take-while
;; https://4clojure.com/problem/114

(fn [n p s]
  (let [mytfs (map p s)]
    (loop [nel 0 nct 0]
      (cond
       (and (< nct n) (nth mytfs nel)) (recur (inc nel) (inc nct))
       (and (< nct n) (not (nth mytfs nel))) (recur (inc nel) nct)
       :else (take (dec nel) s)))))

;; alanforr's solution to Insert between two items
;; https://4clojure.com/problem/132

(fn [p v s]
  (let [d1s (drop 1 s)
        things (map vector s d1s)
        fthings (concat (map #(apply p %) things) [false])
        sfs (map vector s fthings)
        ch (fn [x] (if (nth x 1) [(nth x 0) v] [(nth x 0)]))]
    (apply concat (map ch sfs))))

;; alanforr's solution to Write Roman Numerals
;; https://4clojure.com/problem/104

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

(fn [formula]
  (letfn [(ev [v f]
              (cond
               (number? f) f
               (symbol? f) (v f)
               :else  (apply ({'* * '/ / '+ + '- -} (first f)) (map #(ev v %) (rest f)))))]
    (fn [x] (ev x formula))))

;; alanforr's solution to The Big Divide
;; https://4clojure.com/problem/148

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

(fn [trump]
  (let [wwithsuit (fn [suit cards]
                    (let [sortedcards (group-by :suit cards)
                          right-suit (if (nil? (sortedcards suit))
                                       (:suit (first cards))
                                       suit)
                          wrank (apply max (map :rank (sortedcards right-suit)))]
                      {:suit right-suit :rank wrank}))]
    (fn [cards] (wwithsuit trump cards))))

;; alanforr's solution to Balancing Brackets
;; https://4clojure.com/problem/177

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

(fn [tri]
  (letfn [(minfrom [triangle ind]
            (if (empty? triangle) 0
                (min
                 (+' (nth (first triangle) ind) (minfrom (rest triangle) ind))
                 (+' (nth (first triangle) ind) (minfrom (rest triangle) (inc' ind))))))]
    (minfrom tri 0)))

;; alanforr's solution to Transitive Closure
;; https://4clojure.com/problem/84

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

(fn [& nums]
  (reify
    java.lang.Object
    (toString [thingy] (clojure.string/join ", " (sort nums)))
    clojure.lang.Seqable
    (seq [thingy] (and nums (distinct nums)))))

;; alanforr's solution to For Science!
;; https://4clojure.com/problem/117

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

(fn [] (let [x ["(fn [] (let [x " "] (apply str (x 0) x (x 1))))"]] (apply str (x 0) x (x 1))))

;; alanforr's solution to Tree reparenting
;; https://4clojure.com/problem/130

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
