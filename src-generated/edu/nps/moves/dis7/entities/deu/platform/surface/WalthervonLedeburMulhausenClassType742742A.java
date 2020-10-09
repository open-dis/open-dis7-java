package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71e9ebae
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16638
 */
public class WalthervonLedeburMulhausenClassType742742A extends EntityType
{
    public WalthervonLedeburMulhausenClassType742742A()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16594, Auxiliary
        setSubCategory((byte)10); // uid 16638, Walther von Ledebur / Mulhausen Class (Type 742/742A)
    }
}
