class NumberGenerator:
    def __init__(self, start=0, end=10):
        self.start = start
        self.end = end

    def generate_numbers(self):
        current = self.start
        while current <= self.end:
            yield current
            current += 1


gen = NumberGenerator(1, 5)
for number in gen.generate_numbers():
    print(number)
