package edu.nps.moves.dis7.entities.gbr.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9729a97
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 28715
 */
public class BL755 extends EntityType
{
    public BL755()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20984, Ballistic
        setSubCategory((byte)8); // uid 28714, BL755 Cluster Bomb
        setSpecific((byte)1); // uid 28715, BL755
    }
}
