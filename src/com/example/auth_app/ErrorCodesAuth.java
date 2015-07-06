package com.example.auth_app;


import java.util.*;

public class ErrorCodesAuth {
	static HashMap<Integer,String> errcodes;
	ErrorCodesAuth()
	{
		errcodes=new HashMap<Integer, String>();
		errcodes.put(100,"Pi(basic) attributes of demographic data did not match");
		errcodes.put(570,"Invalid key info in digital signature");
		errcodes.put(511, "Invalid PID XML Format");
		errcodes.put(100,	"Pi (basic) attributes of demographic data did not match");
		errcodes.put(200	,"Pa (address) attributes of demographic data did not match");
		errcodes.put(	300	,"Biometric data did not match");
		errcodes.put(	310,"	Duplicate fingers used");
		errcodes.put(	311,"	Duplicate Irises used");
		errcodes.put(312,"	FMR and FIR cannot be used in same transaction");
		errcodes.put(313,"Single FIR record contains more than one finger");
		errcodes.put(	314,"	Number of FMR/FIR should not exceed 10");
		errcodes.put(	315,"	Number of IIR should not exceed 2");
		errcodes.put(	500,"	Invalid encryption of Skey");
		errcodes.put(	501,"	Invalid certificate identifier in ci attribute of Skey");
		errcodes.put(	502	,"Invalid encryption of Pid");
		errcodes.put(	503	,"Invalid encryption of Hmac");
		/*
		14	504	Session key re-initiation required due to expiry or key out of sync
		15	510	Invalid Auth XML format
		16	511	Invalid PID XML format
		17	520	Invalid device
		18	530	Invalid authenticator code
		19	540	Invalid Auth XML version
		20	541	Invalid PID XML version
		21	542	AUA not authorized for ASA. This error will be returned if AUA and ASA do not have linking in the portal
		22	543	Sub-AUA not associated with AUA. This error will be returned if Sub-AUA specified in sa attribute is not added as Sub-AUA in portal
		23	550	Invalid Uses element attributes
		24	561	Request expired (Pid->ts value is older than N hours where N is a configured threshold in authentication server)
		25	562	Timestamp value is future time (value specified Pid->ts is ahead of authentication server time beyond acceptable threshold)
		26	563	Duplicate request (this error occurs when exactly same authentication request was re-sent by AUA)
		27	564	HMAC Validation failed
		28	565	AUA license key has expired or is invalid
		29	566	ASA license key has expired or is invalid
		30	567	Invalid input (this error occurs when some unsupported characters were found in Indian language values, lname or lav)
		31	568	Unsupported Language
		32	569	Digital signature verification failed (means that authentication request XML was modified after it was signed)
		33	570	Invalid key info in digital signature (this means that certificate used for signing the authentication request is not valid – it is either expired, or does not belong to the AUA or is not created by a well-known Certification Authority)
		34	571	PIN Requires reset (this error will be returned if resident is using the default PIN which needs to be reset before usage)
		35	572	Invalid biometric position (This error is returned if biometric position hint value - posh attribute in Bio element - is not applicable for a given biometric type - type attribute in Bio element.)
		36	573	Pi usage not allowed as per license
		37	574	Pa usage not allowed as per license
		38	575	Pfa usage not allowed as per license
		39	576	FMR usage not allowed as per license
		40	577	FIR usage not allowed as per license
		41	578	IIR usage not allowed as per license
		42	579	OTP usage not allowed as per license
		43	580	PIN usage not allowed as per license
		44	581	Fuzzy matching usage not allowed as per license
		45	582	Local language usage not allowed as per license
		46	710	Missing Pi data as specified in Uses
		47	720	Missing Pa data as specified in Uses
		48	721	Missing Pfa data as specified in Uses
		49	730	Missing PIN data as specified in Uses
		50	740	Missing OTP data as specified in Uses
		51	800	Invalid biometric data
		52	810	Missing biometric data as specified in Uses
		53	811	Missing biometric data in CIDR for the given Aadhaar number
		54	812	Resident has not done Best Finger Detection. Application should initiate BFD application to help resident identify their best fingers. See Aadhaar Best Finger Detection API specification.
		55	820	Missing or empty value for bt attribute in Uses element
		56	821	Invalid value in the bt attribute of Uses element
		57	901	No authentication data found in the request (this corresponds to a scenario wherein none of the auth data – Demo, Pv, or Bios – is present)
		58	902	Invalid dob value in the Pi element (this corresponds to a scenarios wherein dob attribute is not of the format YYYY or YYYY-MM-DD, or the age of resident is not in valid range)
		59	910	Invalid mv value in the Pi element
		60	911	Invalid mv value in the Pfa element
		61	912	Invalid ms value
		62	913	Both Pa and Pfa are present in the authentication request (Pa and Pfa are mutually exclusive)
		63	930	Technical error that are internal to authentication server
		64	931	Technical error that are internal to authentication server
		65	932	Technical error that are internal to authentication server
		66	933	Technical error that are internal to authentication server
		67	934	Technical error that are internal to authentication server
		68	935	Technical error that are internal to authentication server
		69	936	Technical error that are internal to authentication server
		70	937	Technical error that are internal to authentication server
		71	938	Technical error that are internal to authentication server
		72	939	Technical error that are internal to authentication server
		73	940	Unauthorized ASA channel
		74	941	Unspecified ASA channel
		75	980	Unsupported option
		76	999	Unknown error
		*/
		
	}

}
