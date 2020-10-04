package edu.nps.moves.dis7.entities.dnk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5b7a5baa
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 29467
 */
public class Leopard2A5A2DK extends EntityType
{
    public Leopard2A5A2DK()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 28832, Tank
        setSubCategory((byte)3); // uid 29467, Leopard 2A5A2 DK
    }
}