package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6c6333cd;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30535
 */
public class Auxiliary extends EntityType
{
    /** Default constructor */
    public Auxiliary()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 30535, Auxiliary
    }
}
