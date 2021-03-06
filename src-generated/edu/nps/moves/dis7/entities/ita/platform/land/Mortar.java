package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3d3ba765;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18293
 */
public class Mortar extends EntityType
{
    /** Default constructor */
    public Mortar()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)10); // uid 18293, Mortar
    }
}
