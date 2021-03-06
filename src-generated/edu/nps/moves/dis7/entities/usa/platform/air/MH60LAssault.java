package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5cd96b41;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23569
 */
public class MH60LAssault extends EntityType
{
    /** Default constructor */
    public MH60LAssault()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)25); // uid 11184, Special Operations helicopter
        setSubCategory((byte)1); // uid 11185, Sikorsky S-70A
        setSpecific((byte)4); // uid 11189, MH-60L
        setExtra((byte)2); // uid 23569, MH-60L Assault
    }
}
