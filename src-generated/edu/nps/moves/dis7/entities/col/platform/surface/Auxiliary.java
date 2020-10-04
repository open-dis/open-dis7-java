package edu.nps.moves.dis7.entities.col.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@55b699ef
 * Country: Colombia (COL)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27485
 */
public class Auxiliary extends EntityType
{
    public Auxiliary()
    {
        setCountry(Country.COLOMBIA_COL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27485, Auxiliary
    }
}
