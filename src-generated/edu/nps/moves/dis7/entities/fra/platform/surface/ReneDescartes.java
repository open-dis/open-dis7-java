package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71075444;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24417
 */
public class ReneDescartes extends EntityType
{
    /** Default constructor */
    public ReneDescartes()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 24415, Other Vessels
        setSubCategory((byte)4); // uid 24416, Cable Layer Vessel
        setSpecific((byte)1); // uid 24417, Rene Descartes
    }
}
