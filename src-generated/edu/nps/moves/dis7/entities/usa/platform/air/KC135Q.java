package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@67bf0480;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 10916
 */
public class KC135Q extends EntityType
{
    /** Default constructor */
    public KC135Q()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 10867, Cargo/Tanker
        setSubCategory((byte)5); // uid 10913, Boeing KC-135 Stratotanker
        setSpecific((byte)3); // uid 10916, KC-135Q
    }
}
