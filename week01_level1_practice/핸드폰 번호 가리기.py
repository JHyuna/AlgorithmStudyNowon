def solution(phone_number: str) -> str:
    return "*" * (len(phone_number) - 4) + phone_number[-4:]


if __name__ == "__main__":
    assert solution("01033334444") == "*******4444"
    assert solution("027778888") == "*****8888"



