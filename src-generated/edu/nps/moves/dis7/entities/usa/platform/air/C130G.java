package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@9b5f3c7;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29473
 */
public class C130G extends EntityType
{
    /** Default constructor */
    public C130G()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 10867, Cargo/Tanker
        setSubCategory((byte)1); // uid 10868, Lockheed C-130 (Model 382) Hercules
        setSpecific((byte)1); // uid 10869, C-130
        setExtra((byte)11); // uid 29473, C-130G
    }
}
