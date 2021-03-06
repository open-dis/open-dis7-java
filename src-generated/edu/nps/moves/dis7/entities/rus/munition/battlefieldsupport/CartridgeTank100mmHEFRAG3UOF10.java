package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e721583;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 23941
 */
public class CartridgeTank100mmHEFRAG3UOF10 extends EntityType
{
    /** Default constructor */
    public CartridgeTank100mmHEFRAG3UOF10()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)11); // uid 20805, 100 mm
        setSpecific((byte)3); // uid 23941, Cartridge, Tank, 100mm, HE-FRAG, 3UOF-10
    }
}
