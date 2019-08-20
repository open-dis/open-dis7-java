package edu.nps.moves.dis7.objecttypes.PointObject.Tacticalsmoke.TacticalSmoke_Canister.M18_Red;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class M18_Red extends ObjectType
{
    public M18_Red()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(5)); // Tactical smoke
        setCategory((byte)3); // Tactical Smoke, Canister
        setSubCategory((byte)5); // M18, Red
    }
}
