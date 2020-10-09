package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1b46392c
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 32819
 */
public class NoDongChemicalGDND1GD extends EntityType
{
    public NoDongChemicalGDND1GD()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)2); // uid 21609, No Dong
        setSpecific((byte)1); // uid 21610, No Dong Separated Warhead
        setExtra((byte)3); // uid 32819, No Dong, Chemical GD, ND-1-GD
    }
}
