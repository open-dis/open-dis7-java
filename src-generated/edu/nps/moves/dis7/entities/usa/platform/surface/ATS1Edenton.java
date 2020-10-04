package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7455dacb
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11758
 */
public class ATS1Edenton extends EntityType
{
    public ATS1Edenton()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 11701, Auxiliary
        setSubCategory((byte)21); // uid 11757, Edenton class (Salvage Ships)
        setSpecific((byte)1); // uid 11758, ATS 1 Edenton
    }
}
