package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1c2d63f0;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 19497
 */
public class SM3Block1KillWeaponKW extends EntityType
{
    /** Default constructor */
    public SM3Block1KillWeaponKW()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)27); // uid 19475, Standard Missile
        setSpecific((byte)3); // uid 19489, Standard BMD (RIM-61)
        setExtra((byte)8); // uid 19497, SM-3 Block 1 Kill Weapon (KW)
    }
}
