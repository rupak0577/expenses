package com.nominalista.expenses.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class Currency(
    val code: String,
    val title: String,
    val symbol: String,
    val flag: String
) : Parcelable {

    AED("AED", "Emirati Dirham", "د.إ", "\uD83C\uDDE6\uD83C\uDDEA"),
    AFN("AFN", "Afghanistan Afghani", "؋", "\uD83C\uDDE6\uD83C\uDDEB"),
    ALL("ALL", "Albanian Lek", "L", "\uD83C\uDDE6\uD83C\uDDF1"),
    ARS("ARS", "Argentina Peso", "$", "\uD83C\uDDE6\uD83C\uDDF7"),
    AUD("AUD", "Australian Dollar", "$", "\uD83C\uDDE6\uD83C\uDDFA"),
    BBD("BBD", "Barbados Dollar", "$", "\uD83C\uDDE7\uD83C\uDDE7"),
    BDT("BDT", "Bangladeshi Taka", "Tk", "\uD83C\uDDE7\uD83C\uDDE9"),
    BGN("BGN", "Bulgarian Lev", "лв", "\uD83C\uDDE7\uD83C\uDDEC"),
    BHD("BHD", "Bahraini Dinar", "BD", "\uD83C\uDDE7\uD83C\uDDED"),
    BMD("BMD", "Bermuda Dollar","$", "\uD83C\uDDE7\uD83C\uDDF2"),
    BND("BND", "Brunei Darussalam Dollar","$", "\uD83C\uDDE7\uD83C\uDDF3"),
    BOB("BOB", "Bolivia Bolíviano","\$b", "\uD83C\uDDE7\uD83C\uDDF4"),
    BRL("BRL", "Brazil Real","R$", "\uD83C\uDDE7\uD83C\uDDF7"),
    BTN("BTN", "Bhutanese Ngultrum","Nu.", "\uD83C\uDDE7\uD83C\uDDF9"),
    BZD("BZD", "Belize Dollar","BZ$", "\uD83C\uDDE7\uD83C\uDDFF"),
    CAD("CAD", "Canada Dollar","$", "\uD83C\uDDE8\uD83C\uDDE6"),
    CHF("CHF", "Switzerland Franc","CHF", "\uD83C\uDDE8\uD83C\uDDED"),
    CLP("CLP", "Chile Peso","$", "\uD83C\uDDE8\uD83C\uDDF1"),
    CNY("CNY", "China Yuan Renminbi","¥", "\uD83C\uDDE8\uD83C\uDDF3"),
    COP("COP", "Colombia Peso","$", "\uD83C\uDDE8\uD83C\uDDF4"),
    CRC("CRC", "Costa Rica Colon","₡", "\uD83C\uDDE8\uD83C\uDDF7"),
    CZK("CZK", "Czech Koruna", "Kč", "\uD83C\uDDE8\uD83C\uDDFF"),
    DKK("DKK", "Denmark Krone","kr", "\uD83C\uDDE9\uD83C\uDDF0"),
    DOP("DOP", "Dominican Republic Peso","RD$", "\uD83C\uDDE9\uD83C\uDDF4"),
    EGP("EGP", "Egypt Pound","£", "\uD83C\uDDEA\uD83C\uDDEC"),
    ETB("ETB", "Ethiopian Birr","Br", "\uD83C\uDDEA\uD83C\uDDF9"),
    EUR("EUR", "Euro", "€", "\uD83C\uDDEA\uD83C\uDDFA"),
    GBP("GBP", "British Pound", "£", "\uD83C\uDDEC\uD83C\uDDE7"),
    GEL("GEL", "Georgian Lari", "₾", "\uD83C\uDDEC\uD83C\uDDEA"),
    GHS("GHS", "Ghana Cedi", "¢", "\uD83C\uDDEC\uD83C\uDDED"),
    GMD("GMD", "Gambian Dalasi", "D", "\uD83C\uDDEC\uD83C\uDDF2"),
    GTQ("GTQ", "Guatemalan Quetzal", "Q", "\uD83C\uDDEC\uD83C\uDDF9"),
    GYD("GYD", "Guyana Dollar", "$", "\uD83C\uDDEC\uD83C\uDDFE"),
    HKD("HKD", "Hong Kong Dollar","$", "\uD83C\uDDED\uD83C\uDDF0"),
    HRK("HRK", "Croatia Kuna", "kn", "\uD83C\uDDED\uD83C\uDDF7"),
    HUF("HUF", "Hungary Forint", "Ft", "\uD83C\uDDED\uD83C\uDDFA"),
    IDR("IDR", "Indonesia Rupiah","Rp", "\uD83C\uDDEE\uD83C\uDDE9"),
    ILS("ILS", "Israel Shekel", "₪", "\uD83C\uDDEE\uD83C\uDDF1"),
    INR("INR", "India Rupee","₹", "\uD83C\uDDEE\uD83C\uDDF3"),
    ISK("ISK", "Iceland Krona", "kr", "\uD83C\uDDEE\uD83C\uDDF8"),
    JMD("JMD", "Jamaica Dollar", "J$", "\uD83C\uDDEF\uD83C\uDDF2"),
    JPY("JPY", "Japanese Yen", "¥", "\uD83C\uDDEF\uD83C\uDDF5"),
    KHR("KHR", "Cambodian Riel", "៛", "\uD83C\uDDF0\uD83C\uDDED"),
    KES("KES", "Kenyan Shilling", "KSh", "\uD83C\uDDF0\uD83C\uDDEA"),
    KRW("KRW", "Korea (South) Won", "₩", "\uD83C\uDDF0\uD83C\uDDF7"),
    KWD("KWD", "Kuwaiti Dinar", "د.ك", "\uD83C\uDDF0\uD83C\uDDFC"),
    KYD("KYD", "Cayman Islands Dollar", "$", "\uD83C\uDDF0\uD83C\uDDFE"),
    KZT("KZT", "Kazakhstan Tenge", "лв", "\uD83C\uDDF0\uD83C\uDDFF"),
    LAK("LAK", "Laos Kip", "₭", "\uD83C\uDDF1\uD83C\uDDE6"),
    LKR("LKR", "Sri Lanka Rupee", "₨", "\uD83C\uDDF1\uD83C\uDDF0"),
    LRD("LRD", "Liberia Dollar", "$", "\uD83C\uDDF1\uD83C\uDDF7"),
    LTL("LTL", "Lithuanian Litas", "Lt", "\uD83C\uDDF1\uD83C\uDDF9"),
    MAD("MAD", "Moroccan Dirham", "MAD", "\uD83C\uDDF2\uD83C\uDDE6"),
    MDL("MDL", "Moldovan Leu", "MDL", "\uD83C\uDDF2\uD83C\uDDE9"),
    MKD("MKD", "Macedonia Denar", "ден", "\uD83C\uDDF2\uD83C\uDDF0"),
    MMK("MMK", "Burmese Kyat", "K", "\uD83C\uDDF2\uD83C\uDDF2"),
    MNT("MNT", "Mongolia Tughrik", "₮", "\uD83C\uDDF2\uD83C\uDDF3"),
    MUR("MUR", "Mauritius Rupee", "₨", "\uD83C\uDDF2\uD83C\uDDF7"),
    MWK("MWK", "Malawian Kwacha", "MK", "\uD83C\uDDF2\uD83C\uDDFC"),
    MXN("MXN", "Mexico Peso", "$", "\uD83C\uDDF2\uD83C\uDDFD"),
    MYR("MYR", "Malaysia Ringgit", "RM", "\uD83C\uDDF2\uD83C\uDDFE"),
    MZN("MZN", "Mozambique Metical", "MT", "\uD83C\uDDF2\uD83C\uDDFF"),
    NAD("NAD", "Namibia Dollar", "$", "\uD83C\uDDF3\uD83C\uDDE6"),
    NGN("NGN", "Nigeria Naira", "₦", "\uD83C\uDDF3\uD83C\uDDEC"),
    NIO("NIO", "Nicaragua Cordoba", "C$", "\uD83C\uDDF3\uD83C\uDDEE"),
    NOK("NOK", "Norway Krone", "kr", "\uD83C\uDDF3\uD83C\uDDF4"),
    NPR("NPR", "Nepal Rupee", "₨", "\uD83C\uDDF3\uD83C\uDDF5"),
    NZD("NZD", "New Zealand Dollar", "$", "\uD83C\uDDF3\uD83C\uDDFF"),
    OMR("OMR", "Oman Rial", "﷼", "\uD83C\uDDF4\uD83C\uDDF2"),
    PEN("PEN", "Peru Sol", "S/.", "\uD83C\uDDF5\uD83C\uDDEA"),
    PGK("PGK", "Papua New Guinean Kina", "K", "\uD83C\uDDF5\uD83C\uDDEC"),
    PHP("PHP", "Philippines Peso", "₱", "\uD83C\uDDF5\uD83C\uDDED"),
    PKR("PKR", "Pakistan Rupee", "₨", "\uD83C\uDDF5\uD83C\uDDF0"),
    PLN("PLN", "Polski zloty", "zł", "\uD83C\uDDF5\uD83C\uDDF1"),
    PYG("PYG", "Paraguay Guarani","Gs", "\uD83C\uDDF5\uD83C\uDDFE"),
    QAR("QAR", "Qatar Riyal","﷼", "\uD83C\uDDF6\uD83C\uDDE6"),
    RON("RON", "Romania Leu","lei", "\uD83C\uDDF7\uD83C\uDDF4"),
    RSD("RSD", "Serbia Dinar","Дин.", "\uD83C\uDDF7\uD83C\uDDF8"),
    RUB("RUB", "Russia Ruble","₽", "\uD83C\uDDF7\uD83C\uDDFA"),
    SAR("SAR", "Saudi Arabia Riyal","﷼", "\uD83C\uDDF8\uD83C\uDDE6"),
    SEK("SEK", "Sweden Krona","kr", "\uD83C\uDDF8\uD83C\uDDEA"),
    SGD("SGD", "Singapore Dollar","$", "\uD83C\uDDF8\uD83C\uDDEC"),
    SOS("SOS", "Somalia Shilling","S", "\uD83C\uDDF8\uD83C\uDDF4"),
    SRD("SRD", "Suriname Dollar","$", "\uD83C\uDDF8\uD83C\uDDF7"),
    THB("THB", "Thailand Baht","฿", "\uD83C\uDDF9\uD83C\uDDED"),
    TRY("TRY", "Turkish Lira", "₺", "\uD83C\uDDF9\uD83C\uDDF7"),
    TTD("TTD", "Trinidad and Tobago Dollar","TT$", "\uD83C\uDDF9\uD83C\uDDF9"),
    TWD("TWD", "Taiwan New Dollar","NT$", "\uD83C\uDDF9\uD83C\uDDFC"),
    TZS("TZS", "Tanzanian Shilling","TSh", "\uD83C\uDDF9\uD83C\uDDFF"),
    UAH("UAH", "Ukraine Hryvnia","₴", "\uD83C\uDDFA\uD83C\uDDE6"),
    UGX("UGX", "Ugandan Shilling","USh", "\uD83C\uDDFA\uD83C\uDDEC"),
    USD("USD", "United States Dollar", "$", "\uD83C\uDDFA\uD83C\uDDF8"),
    UYU("UYU", "Uruguay Peso","\$U", "\uD83C\uDDFA\uD83C\uDDFE"),
    VEF("VEF", "Venezuela Bolívar","Bs", "\uD83C\uDDFB\uD83C\uDDEA"),
    VND("VND", "Viet Nam Dong","₫", "\uD83C\uDDFB\uD83C\uDDF3"),
    YER("YER", "Yemen Rial","﷼", "\uD83C\uDDFE\uD83C\uDDEA"),
    ZAR("ZAR", "South Africa Rand","R", "🇿🇦");

    companion object {

        fun fromCode(code: String): Currency? {
            return values().firstOrNull { currency -> currency.code == code }
        }
    }

    val description get() = "$flag   $title ($code)"
}