package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@780ec4a5
 * Country: Libya (LBY)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18925
 */
public class AssadELTOUGOUR extends EntityType
{
    public AssadELTOUGOUR()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18922, Frigate(including Corvette)
        setSubCategory((byte)1); // uid 18923, Assad Class
        setSpecific((byte)2); // uid 18925, Assad ELTOUGOUR
    }
}