public class HttpStatus {

    public static final int CONTINUE = 100;
    public static final int SWITCHING_PROTOCOLS = 101;
    public static final int PROCESSING = 102;
    public static final int EARLY_HINTS = 103;
    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int ACCEPTED = 202;
    public static final int NON_AUTHORITATIVE_INFORMATION = 203;
    public static final int NO_CONTENT = 204;
    public static final int RESET_CONTENT = 205;
    public static final int PARTIAL_CONTENT = 206;
    public static final int MULTI_STATUS = 207;
    public static final int ALREADY_REPORTED = 208;
    public static final int IM_USED = 226;
    public static final int MULTIPLE_CHOICES = 300;
    public static final int MOVED_PERMANENTLY = 301;
    public static final int FOUND = 302;
    public static final int SEE_OTHER = 303;
    public static final int NOT_MODIFIED = 304;
    public static final int USE_PROXY = 305;
    public static final int TEMPORARY_REDIRECT = 307;
    public static final int PERMANENT_REDIRECT = 308;
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int PAYMENT_REQUIRED = 402;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int METHOD_NOT_ALLOWED = 405;
    public static final int NOT_ACCEPTABLE = 406;
    public static final int PROXY_AUTHENTICATION_REQUIRED = 407;
    public static final int REQUEST_TIMEOUT = 408;
    public static final int CONFLICT = 409;
    public static final int GONE = 410;
    public static final int LENGTH_REQUIRED = 411;
    public static final int PRECONDITION_FAILED = 412;
    public static final int PAYLOAD_TOO_LARGE = 413;
    public static final int URI_TOO_LONG = 414;
    public static final int UNSUPPORTED_MEDIA_TYPE = 415;
    public static final int RANGE_NOT_SATISFIABLE = 416;
    public static final int EXPECTATION_FAILED = 417;
    public static final int IM_A_TEAPOT = 418;
    public static final int MISDIRECTED_REQUEST = 421;
    public static final int UNPROCESSABLE_ENTITY = 422;
    public static final int LOCKED = 423;
    public static final int FAILED_DEPENDENCY = 424;
    public static final int TOO_EARLY = 425;
    public static final int UPGRADE_REQUIRED = 426;
    public static final int PRECONDITION_REQUIRED = 428;
    public static final int TOO_MANY_REQUESTS = 429;
    public static final int REQUEST_HEADER_FIELDS_TOO_LARGE = 431;
    public static final int UNAVAILABLE_FOR_LEGAL_REASONS = 451;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int NOT_IMPLEMENTED = 501;
    public static final int BAD_GATEWAY = 502;
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final int GATEWAY_TIMEOUT = 504;
    public static final int HTTP_VERSION_NOT_SUPPORTED = 505;
    public static final int VARIANT_ALSO_NEGOTIATES = 506;
    public static final int INSUFFICIENT_STORAGE = 507;
    public static final int LOOP_DETECTED = 508;
    public static final int NOT_EXTENDED = 510;
    public static final int NETWORK_AUTHENTICATION_REQUIRED = 511;

    public static final String[] DESCRIPTIONS = {
        /* 100 */ "Continue",
        /* 101 */ "Switching Protocols",
        /* 102 */ "Processing",
        /* 103 */ "Early Hints",
        /* 200 */ "OK",
        /* 201 */ "Created",
        /* 202 */ "Accepted",
        /* 203 */ "Non-Authoritative Information",
        /* 204 */ "No Content",
        /* 205 */ "Reset Content",
        /* 206 */ "Partial Content",
        /* 207 */ "Multi-Status",
        /* 208 */ "Already Reported",
        /* 226 */ "IM Used",
        /* 300 */ "Multiple Choices",
        /* 301 */ "Moved Permanently",
        /* 302 */ "Found",
        /* 303 */ "See Other",
        /* 304 */ "Not Modified",
        /* 305 */ "Use Proxy",
        /* 307 */ "Temporary Redirect",
        /* 308 */ "Permanent Redirect",
        /* 400 */ "Bad Request",
        /* 401 */ "Unauthorized",
        /* 402 */ "Payment Required",
        /* 403 */ "Forbidden",
        /* 404 */ "Not Found",
        /* 405 */ "Method Not Allowed",
        /* 406 */ "Not Acceptable",
        /* 407 */ "Proxy Authentication Required",
        /* 408 */ "Request Timeout",
        /* 409 */ "Conflict",
        /* 410 */ "Gone",
        /* 411 */ "Length Required",
        /* 412 */ "Precondition Failed",
        /* 413 */ "Payload Too Large",
        /* 414 */ "URI Too Long",
        /* 415 */ "Unsupported Media Type",
        /* 416 */ "Range Not Satisfiable",
        /* 417 */ "Expectation Failed",
        /* 418 */ "I'm a teapot",
        /* 421 */ "Misdirected Request",
        /* 422 */ "Unprocessable Entity",
        /* 423 */ "Locked",
        /* 424 */ "Failed Dependency",
        /* 425 */ "Too Early",
        /* 426 */ "Upgrade Required",
        /* 428 */ "Precondition Required",
        /* 429 */ "Too Many Requests",
        /* 431 */ "Request Header Fields Too Large",
        /* 451 */ "Unavailable For Legal Reasons",
        /* 500 */ "Internal Server Error",
        /* 501 */ "Not Implemented",
        /* 502 */ "Bad Gateway",
        /* 503 */ "Service Unavailable",
        /* 504 */ "Gateway Timeout",
        /* 505 */ "HTTP Version Not Supported",
        /* 506 */ "Variant Also Negotiates",
        /* 507 */ "Insufficient Storage",
        /* 508 */ "Loop Detected",
        /* 510 */ "Not Extended",
        /* 511 */ "Network Authentication Required"
    };

    public static String getDescription(int code) {
        switch (code) {
            case 100: return DESCRIPTIONS[0];
            case 101: return DESCRIPTIONS[1];
            case 102: return DESCRIPTIONS[2];
            case 103: return DESCRIPTIONS[3];
            case 200: return DESCRIPTIONS[4];
            case 201: return DESCRIPTIONS[5];
            case 202: return DESCRIPTIONS[6];
            case 203: return DESCRIPTIONS[7];
            case 204: return DESCRIPTIONS[8];
            case 205: return DESCRIPTIONS[9];
            case 206: return DESCRIPTIONS[10];
            case 207: return DESCRIPTIONS[11];
            case 208: return DESCRIPTIONS[12];
            case 226: return DESCRIPTIONS[13];
            case 300: return DESCRIPTIONS[14];
            case 301: return DESCRIPTIONS[15];
            case 302: return DESCRIPTIONS[16];
            case 303: return DESCRIPTIONS[17];
            case 304: return DESCRIPTIONS[18];
            case 305: return DESCRIPTIONS[19];
            case 307: return DESCRIPTIONS[20];
            case 308: return DESCRIPTIONS[21];
            case 400: return DESCRIPTIONS[22];
            case 401: return DESCRIPTIONS[23];
            case 402: return DESCRIPTIONS[24];
            case 403: return DESCRIPTIONS[25];
            case 404: return DESCRIPTIONS[26];
            case 405: return DESCRIPTIONS[27];
            case 406: return DESCRIPTIONS[28];
            case 407: return DESCRIPTIONS[29];
            case 408: return DESCRIPTIONS[30];
            case 409: return DESCRIPTIONS[31];
            case 410: return DESCRIPTIONS[32];
            case 411: return DESCRIPTIONS[33];
            case 412: return DESCRIPTIONS[34];
            case 413: return DESCRIPTIONS[35];
            case 414: return DESCRIPTIONS[36];
            case 415: return DESCRIPTIONS[37];
            case 416: return DESCRIPTIONS[38];
            case 417: return DESCRIPTIONS[39];
            case 418: return DESCRIPTIONS[40];
            case 421: return DESCRIPTIONS[41];
            case 422: return DESCRIPTIONS[42];
            case 423: return DESCRIPTIONS[43];
            case 424: return DESCRIPTIONS[44];
            case 425: return DESCRIPTIONS[45];
            case 426: return DESCRIPTIONS[46];
            case 428: return DESCRIPTIONS[47];
            case 429: return DESCRIPTIONS[48];
            case 431: return DESCRIPTIONS[49];
            case 451: return DESCRIPTIONS[50];
            case 500: return DESCRIPTIONS[51];
            case 501: return DESCRIPTIONS[52];
            case 502: return DESCRIPTIONS[53];
            case 503: return DESCRIPTIONS[54];
            case 504: return DESCRIPTIONS[55];
            case 505: return DESCRIPTIONS[56];
            case 506: return DESCRIPTIONS[57];
            case 507: return DESCRIPTIONS[58];
            case 508: return DESCRIPTIONS[59];
            case 510: return DESCRIPTIONS[60];
            case 511: return DESCRIPTIONS[61];
            default: return "Unknown Status Code";
        }
    }
}
