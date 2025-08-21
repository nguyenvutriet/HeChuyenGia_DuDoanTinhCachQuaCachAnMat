
def duDoan(thoiT, tapLuat):
    tinhC = "Không tìm thấy"
    for i in range(len(tapLuat)):
        if thoiT == tapLuat[i][0]:
            tinhC = tapLuat[i][1]
            break
    return tinhC

# Xây dựng cơ sở tri thức (tập luật)
tapLuat = [
    ["áo sơ mi", "tinh tế"],
    ["áo đen", "nghiêm túc và bí ẩn"],
    ["quần dài", "chuyên nghiệp và cẩn trọng"],
    ["giày thể thao", "năng động và thích phiêu lưu"],
    ["quần đùi", "phóng khoáng"]
]

while True:

    print("Nhập quần áo bạn mặc hôm nay: ")
    thoiTrang = input().strip().lower()

    # nhập 0 để thoát chương trình
    if thoiTrang != "0":
        tinhCach = duDoan(thoiTrang, tapLuat)
        print("Tính Cách: ", tinhCach)
    else:
        break