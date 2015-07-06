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
		errcodes.put(	503	,"504	Session key re-initiation required due to expiry or key out of sync");
		errcodes.put(510	,"Invalid Auth XML format");
		errcodes.put(511	,"Invalid PID XML format");
		errcodes.put(511,"520	Invalid device");
		errcodes.put(530	,"Invalid authenticator code");
		errcodes.put(	540	,"Invalid Auth XML version");
		errcodes.put(541	,"Invalid PID XML version");
		errcodes.put(542,"	AUA not authorized for ASA. This error will be returned if AUA and ASA do not have linking in the portal");
		errcodes.put(543	,"Sub-AUA not associated with AUA. This error will be returned if Sub-AUA specified in sa attribute is not added as Sub-AUA in portal");
				errcodes.put(550	,"Invalid Uses element attributes");
						errcodes.put(	561	,"Request expired (Pid->ts value is older than N hours where N is a configured threshold in authentication server");
						errcodes.put(	562,"	Timestamp value is future time (value specified Pid->ts is ahead of authentication server time beyond acceptable threshold)");
						errcodes.put(563	,"Duplicate request (this error occurs when exactly same authentication request was re-sent by AUA)");
						errcodes.put(	564	,"HMAC Validation failed");
						errcodes.put(	565,"	AUA license key has expired or is invalid");
						errcodes.put(	566	,"ASA license key has expired or is invalid");
		errcodes.put(	567,"	Invalid input (this error occurs when some unsupported characters were found in Indian language values, lname or lav)");
		errcodes.put(	568,"	Unsupported Language");
		errcodes.put(	569	,"Digital signature verification failed (means that authentication request XML was modified after it was signed)");
		errcodes.put(570	,"Invalid key info in digital signature (this means that certificate used for signing the authentication request is not valid – it is either expired, or does not belong to the AUA or is not created by a well-known Certification Authority)");
		errcodes.put(	571	,"PIN Requires reset (this error will be returned if resident is using the default PIN which needs to be reset before usage)");
		errcodes.put(	572	,"Invalid biometric position (This error is returned if biometric position hint value - posh attribute in Bio element - is not applicable for a given biometric type - type attribute in Bio element.)");
				errcodes.put(	573	,"Pi usage not allowed as per license");
						errcodes.put(	574	,"Pa usage not allowed as per license");
								errcodes.put(	575	,"Pfa usage not allowed as per license");
								errcodes.put(576	,"FMR usage not allowed as per license");
								errcodes.put(543,"577	FIR usage not allowed as per license");
								errcodes.put(578	,"IIR usage not allowed as per license");
								errcodes.put(579	,"OTP usage not allowed as per license");
								errcodes.put(580	,"PIN usage not allowed as per license");
								errcodes.put(	581	,"Fuzzy matching usage not allowed as per license");
								errcodes.put(	582,"	Local language usage not allowed as per license");
								errcodes.put(	710,"	Missing Pi data as specified in Uses");
								errcodes.put(	720	,"Missing Pa data as specified in Uses");
								errcodes.put(	721	,"Missing Pfa data as specified in Uses");
								errcodes.put(730	,"Missing PIN data as specified in Uses");
								errcodes.put(	740	,"Missing OTP data as specified in Uses");
								errcodes.put(	800	,"Invalid biometric data");
								errcodes.put(	810	,"Missing biometric data as specified in Uses");
								errcodes.put(	811	,"Missing biometric data in CIDR for the given Aadhaar number");
								errcodes.put(	812	,"Resident has not done Best Finger Detection. Application should initiate BFD application to help resident identify their best fingers. See Aadhaar Best Finger Detection API specification.");
								errcodes.put(	820	,"Missing or empty value for bt attribute in Uses element");
								errcodes.put(	821	,"Invalid value in the bt attribute of Uses element");
								errcodes.put(901	,"No authentication data found in the request (this corresponds to a scenario wherein none of the auth data – Demo, Pv, or Bios – is present)");
								errcodes.put(902	,"Invalid dob value in the Pi element (this corresponds to a scenarios wherein dob attribute is not of the format YYYY or YYYY-MM-DD, or the age of resident is not in valid range)");
								errcodes.put(910	,"Invalid mv value in the Pi element");
								errcodes.put(911	,"Invalid mv value in the Pfa element");
								errcodes.put(	912	,"Invalid ms value");
										errcodes.put(	913	,"Both Pa and Pfa are present in the authentication request (Pa and Pfa are mutually exclusive)");
												errcodes.put(	930	,"Technical error that are internal to authentication server");
												errcodes.put(	931	,"Technical error that are internal to authentication server");
														errcodes.put(	932	,"Technical error that are internal to authentication server");
																errcodes.put(	933	,"Technical error that are internal to authentication server");
								errcodes.put(	934	,"Technical error that are internal to authentication server");
																		errcodes.put(	935	,"Technical error that are internal to authentication server");
																				errcodes.put(	936	,"Technical error that are internal to authentication server");
																						errcodes.put(	937	,"Technical error that are internal to authentication server");
																								errcodes.put(	938	,"Technical error that are internal to authentication server");
																			errcodes.put(	939	,"Technical error that are internal to authentication server");
																												errcodes.put(	940	,"Unauthorized ASA channel");
							errcodes.put(	941,"	Unspecified ASA channel");
									errcodes.put(980,"	Unsupported option");
									errcodes.put(	999	,"Unknown error");
		
		
	}

}
